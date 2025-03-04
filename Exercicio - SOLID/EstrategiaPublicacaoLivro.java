public class EstrategiaPublicacaoLivro implements PublicavelInterface {
    @Override
    public void publicar() {
        System.out.println("Publicando um livro no sistema de biblioteca...");
    }
}
public class EstrategiaPublicacaoArtigo implements PublicavelInterface {
    @Override
    public void publicar() {
        System.out.println("Publicando um artigo em um periódico acadêmico...");
    }
}
public interface PublicavelInterface {
    void publicar();
}