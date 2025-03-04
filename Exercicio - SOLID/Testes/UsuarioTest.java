import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Gabriel", 21);
    }

    @Test
    void testGetNome() {
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    void testGetIdade() {
        assertEquals(21, usuario.getIdade());
    }
}