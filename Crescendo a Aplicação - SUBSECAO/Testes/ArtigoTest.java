import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtigoTest {
    private Artigo artigo;
    private Autor autor;

    @BeforeEach
    void setUp() {
        autor = new Autor("Alan Turing", "Inglês", true);
        artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
    }

    @Test
    void testGetTitulo() {
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
    }
}