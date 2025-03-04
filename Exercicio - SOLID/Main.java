public class Main {
    public static void main(String[] args) {
        Autor autorLivro = new Autor("Alan Turing", "Inglês", true, new EstrategiaPublicacaoLivro());
        Autor autorArtigo = new Autor("Isaac Newton", "Britânico", true, new EstrategiaPublicacaoArtigo());

        System.out.println("Publicação de Livro:");
        autorLivro.publicar();

        System.out.println("\nPublicação de Artigo:");
        autorArtigo.publicar();

        System.out.println("\nAlterando estratégia...");
        autorLivro.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autorLivro.publicar();
    }
}
