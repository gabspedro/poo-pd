public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Alan Turing", "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        System.out.println("Livro: " + livro.getTitulo() + " - Autor: " + livro.getAutor().getNome());
        System.out.println("Artigo: " + artigo.getTitulo() + " - Autor: " + artigo.getAutor().getNome());
    }
}