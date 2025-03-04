import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {
    private Autor autorUsuario;
    private Autor autorTradicional;

    @BeforeEach
    void setUp() {
        autorUsuario = new Autor("Alan Turing", "Inglês", true);
        autorTradicional = new Autor("Isaac Asimov", "Americano", false);
    }

    @Test
    void testGetNome() {
        assertEquals("Alan Turing", autorUsuario.getNome());
    }

    @Test
    void testGetNacionalidade() {
        assertEquals("Inglês", autorUsuario.getNacionalidade());
    }

    @Test
    void testEhUsuario() {
        assertTrue(autorUsuario.isEhUsuario());
        assertFalse(autorTradicional.isEhUsuario());
    }
}