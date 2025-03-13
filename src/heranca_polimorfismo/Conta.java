package heranca_polimorfismo;

public class Conta extends EntidadeFinanceira {
    // Atributos da Conta
    private String agencia;
    private String numero;
    private String tipoconta;
    private String cpf;
    private double saldo;

    // Construtor com parâmetros com os atributos da Conta + o que herdou da EntidadeFinanceira
    public Conta(String nome, String id, String agencia, String numero, String tipoconta, String cpf, double saldo) {
        super(nome, id); // chama o construtor da Super classe "EntidadeFinanceira" usando o "SUPER" e inserindo os atributos
        this.agencia = agencia;
        this.numero = numero;
        this.tipoconta = tipoconta;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos
    public void exibirInfo() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Informações da conta");
        System.out.println("");
        super.exibirInfo(); //reutiliza o metodo da SuperClasse para exibir as infomações como "Nome" e "ID"
        System.out.println("Agência: " + agencia);
        System.out.println("Número da conta: " + numero);
        System.out.println("Tipo de conta: " + tipoconta);
        System.out.println("CPF Usuario: " + cpf);
        System.out.println("Saldo: " + saldo);
    }
}

