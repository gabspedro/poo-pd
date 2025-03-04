import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {
    private Emprestimo emprestimo;
    private Livro livro;
    private Usuario usuario;
    private Date dataRetirada;
    private Date dataDevolucao;

    @BeforeEach
    void setUp() {
        dataRetirada = new Date();
        dataDevolucao = new Date();
        livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", true), "Tecnologia", true);
        usuario = new Usuario("Gabriel", 21);
        emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
    }

    @Test
    void testGetLivro() {
        assertEquals(livro, emprestimo.getLivro());
    }
}