import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {
    private Autor autor;

    @BeforeEach
    void setUp() {
        autor = new Autor("Alan Turing", "Inglês");
    }

    @Test
    void testGetNome() {
        assertEquals("Alan Turing", autor.getNome());
    }

    @Test
    void testGetNacionalidade() {
        assertEquals("Inglês", autor.getNacionalidade());
    }
}
