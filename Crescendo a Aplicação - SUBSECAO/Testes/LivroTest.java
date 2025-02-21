import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    private Autor autor;
    private Livro livro1;
    private Livro livro2;

    @BeforeEach
    void setUp() {
        autor = new Autor("Jess", "Brasileira", false);
        livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
    }

    @Test
    void testLivroDisponivel() {
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }
}