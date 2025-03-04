public class Autor {
    private String nome;
    private String nacionalidade;
    private boolean ehUsuario;
    private PublicavelInterface estrategiaPublicacao; // Estratégia de publicação

    public Autor(String nome, String nacionalidade, boolean ehUsuario, PublicavelInterface estrategiaPublicacao) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
        this.estrategiaPublicacao = estrategiaPublicacao;
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

    public void setEstrategiaPublicacao(PublicavelInterface estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}