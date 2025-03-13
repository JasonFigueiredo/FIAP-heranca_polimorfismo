package heranca_polimorfismo;

public class Investimento {
    // Atributos
    private String tipoInvestimento;
    private double valorInvestido;
    private double rendimento;

    // Construtor com parâmetros
    public Investimento(String tipoInvestimento, double valorInvestido, double rendimento) {
       this.tipoInvestimento = tipoInvestimento;
       this.valorInvestido = valorInvestido;
       this.rendimento = rendimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    // Métodos
    public void exibirInfo() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("Informações do Investimento");
        System.out.println("");
        System.out.println("Tipo de investimento: " + tipoInvestimento);
        System.out.println("O valor Investido foi de: " + valorInvestido);
        System.out.println("Seu rendimento é de: " + rendimento);
    }
}


