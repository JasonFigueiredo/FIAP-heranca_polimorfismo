package heranca_polimorfismo.controller;

import java.util.Scanner;
import heranca_polimorfismo.model.*;
import heranca_polimorfismo.view.*;

public class MainController {
    private LoginController loginController;
    private ContaController contaController;
    private InvestimentoController investimentoController;
    private TransacaoController transacaoController;
    private MainView mainView;

    public MainController() {
        Login login = new Login("Neto-Filho123", "netofilho@gmail.com", "senha3456");
        LoginView loginView = new LoginView();
        loginController = new LoginController(login, loginView);

        loginController.performLogin("netofilho@gmail.com", "senha3456");
        String userId = loginController.getLoginId();

        Conta conta = new Conta(userId, "Neto Filho", "ID-001", "5544", "34566-5",
                "Conta Corrente", "345.657.345-60",
                1000.00);
        Investimento investimento = new Investimento(userId, "Poupança", 1000.00, 10.05);
        Transacao transacao = new Transacao(userId, "Tranferencia", "100.00", "01/01/2021",
                "123456-7");

        ContaView contaView = new ContaView();
        InvestimentoView investimentoView = new InvestimentoView();
        TransacaoView transacaoView = new TransacaoView();
        mainView = new MainView();

        contaController = new ContaController(conta, contaView);
        investimentoController = new InvestimentoController(investimento, investimentoView);
        transacaoController = new TransacaoController(transacao, transacaoView);

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            mainView.displayMenu();
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.print("Digite seu email: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senha = scanner.nextLine();
                    loginController.performLogin(email, senha);
                    String userId = loginController.getLoginId();
                    if (userId != null) {
                        updateUserId(userId);
                    }
                    break;
                case "2":
                    contaController.displayConta();
                    break;
                case "3":
                    investimentoController.displayInvestimento();
                    break;
                case "4":
                    transacaoController.displayTransacao();
                    break;
                case "5":
                    running = false;
                    System.out.println("Encerrando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }

    private void updateUserId(String userId) {
        contaController.getConta().setUserId(userId);
        investimentoController.getInvestimento().setUserId(userId);
        transacaoController.getTransacao().setUserId(userId);
    }
}
