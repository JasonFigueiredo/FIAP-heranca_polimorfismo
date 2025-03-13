package heranca_polimorfismo;

// Superclasse base para reutilização e herdar os dados para as classes criadas que podem utilizar esses dados
public class EntidadeFinanceira {
    private String nome;
    private String id;

    public EntidadeFinanceira(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
    }
}