package heranca_polimorfismo;

public class Login extends Pessoa {
    // Atributos
    private String senha;

    // Construtor com parâmetros
    public Login(String nome, String email, String senha) {
        super(nome, email);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Métodos
    public void exibirInfo() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("Informações de Login");
        System.out.println("");
        super.exibirInfo();
        System.out.println("Senha: " + senha);
    }
}

