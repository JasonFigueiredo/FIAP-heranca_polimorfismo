package heranca_polimorfismo;

public class Transacao {
    // Atributos
    private String tipo;
    private String valor;
    private String data;
    private String numeroTransferencia;

    // Construtor com parâmetros
    public Transacao(String tipo, String valor, String data, String numeroTransferencia) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.numeroTransferencia = numeroTransferencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumeroTransferencia() {
        return numeroTransferencia;
    }

    public void setNumeroTransferencia(String numeroTransferencia) {
        this.numeroTransferencia = numeroTransferencia;
    }

    // Métodos
    public void exibirInfo() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("Informações de Transação");
        System.out.println("");
        System.out.println("Registrando transação: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Número conta transferência: " + numeroTransferencia);
    }
}
