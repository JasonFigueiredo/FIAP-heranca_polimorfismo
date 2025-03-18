package heranca_polimorfismo.model;

import java.util.UUID;

public class Login extends Pessoa {
    // Atributos
    private String senha;
    private String id;

    // Construtor com parâmetros
    public Login(String nome, String email, String senha) {
        super(nome, email);
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void logar(String email, String senha) {
        if (email.equals(getEmail()) && senha.equals(this.senha)) {
            String randomId = UUID.randomUUID().toString();
            System.out.println("Login realizado com sucesso! " + getNome() + " " + randomId);
            this.id = randomId;
        } else {
            throw new IllegalArgumentException("Email ou senha incorretos.");
        }
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
