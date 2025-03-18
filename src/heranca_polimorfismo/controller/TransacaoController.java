package heranca_polimorfismo.controller;

import heranca_polimorfismo.model.Transacao;
import heranca_polimorfismo.view.TransacaoView;

public class TransacaoController {
    private Transacao transacao;
    private TransacaoView transacaoView;

    public TransacaoController(Transacao transacao, TransacaoView transacaoView) {
        this.transacao = transacao;
        this.transacaoView = transacaoView;
    }

    public void displayTransacao() {
        transacaoView.displayTransacaoInfo(transacao);
    }

    public Transacao getTransacao() {
        return transacao;
    }
}
