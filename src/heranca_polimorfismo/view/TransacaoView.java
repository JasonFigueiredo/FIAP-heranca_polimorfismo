package heranca_polimorfismo.view;

import heranca_polimorfismo.model.Transacao;

public class TransacaoView {
    public void displayTransacaoInfo(Transacao transacao) {
        transacao.exibirInfo();
    }
}
