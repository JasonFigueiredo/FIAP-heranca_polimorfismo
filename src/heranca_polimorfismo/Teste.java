package heranca_polimorfismo;

public class Teste {
    public static void main(String[] args) {
        // Classe de conta com atributos e métodos para exibir informações.
        // e deverá ser sempre preenchido na mesma sequencia da classe "Conta" Seguindo os Contrutores com parametros
        // EX: nome,id,agencia,numero,tipoconta,saldo
        Conta Conta = new Conta("Neto Filho","ID-001","5544","34566-5","Conta Corrente","345.657.345-60",1000.00);
        Conta.exibirInfo();

        // Classe de login com atributos e métodos para autenticar usuário
        // e deverá ser sempre preenchido na mesma sequencia da classe "Login" Seguindo os Contrutores com parametros
        //EX: nome,email,senha
        Login Login = new Login("Neto-Filho123","netofilho@gmail.com","senha3456");
        Login.exibirInfo();

        // Classe de transação com atributos e métodos para registrar
        Transacao Transacao = new Transacao("Tranferencia","100.00","01/01/2021","123456-7");
        Transacao.exibirInfo();

        // Classe de investimento com atributos e métodos para calcular rendimento
        Investimento Investimento = new Investimento("Poupança",1000.00,10.05);
        Investimento.exibirInfo();
    }
}
