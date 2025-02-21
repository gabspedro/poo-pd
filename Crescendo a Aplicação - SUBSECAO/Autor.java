public class Autor {
    private String nome;
    private String nacionalidade;
    private boolean ehUsuario; // Novo campo

    public Autor(String nome, String nacionalidade, boolean ehUsuario) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isEhUsuario() {
        return ehUsuario;
    }
}