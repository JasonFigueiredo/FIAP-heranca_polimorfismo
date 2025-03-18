package heranca_polimorfismo.controller;

import heranca_polimorfismo.model.Conta;
import heranca_polimorfismo.view.ContaView;

public class ContaController {
    private Conta conta;
    private ContaView contaView;

    public ContaController(Conta conta, ContaView contaView) {
        this.conta = conta;
        this.contaView = contaView;
    }

    public void displayConta() {
        contaView.displayContaInfo(conta);
    }

    public Conta getConta() {
        return conta;
    }
}
