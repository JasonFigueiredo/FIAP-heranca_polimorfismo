package heranca_polimorfismo.controller;

import heranca_polimorfismo.model.Investimento;
import heranca_polimorfismo.view.InvestimentoView;

public class InvestimentoController {
    private Investimento investimento;
    private InvestimentoView investimentoView;

    public InvestimentoController(Investimento investimento, InvestimentoView investimentoView) {
        this.investimento = investimento;
        this.investimentoView = investimentoView;
    }

    public void displayInvestimento() {
        investimentoView.displayInvestimentoInfo(investimento);
    }

    public Investimento getInvestimento() {
        return investimento;
    }
}
