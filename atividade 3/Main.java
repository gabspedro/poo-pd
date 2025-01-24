import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando autor
        Autor autor = new Autor("Jessica Felix", "Brasileira");

        // Criando livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        // Criando usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Criando datas de retirada e devolução
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        // Criando empréstimo
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        // Exibindo informações
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("Genero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
