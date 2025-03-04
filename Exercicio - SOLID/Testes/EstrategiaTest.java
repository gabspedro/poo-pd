import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicacaoStrategyTest {
    private Autor autorLivro;
    private Autor autorArtigo;

    @BeforeEach
    void setUp() {
        autorLivro = new Autor("Alan Turing", "Inglês", true, new EstrategiaPublicacaoLivro());
        autorArtigo = new Autor("Isaac Newton", "Britânico", true, new EstrategiaPublicacaoArtigo());
    }

    @Test
    void testPublicacaoLivro() {
        assertDoesNotThrow(() -> autorLivro.publicar());
    }

    @Test
    void testPublicacaoArtigo() {
        assertDoesNotThrow(() -> autorArtigo.publicar());
    }

    @Test
    void testTrocaDeEstrategia() {
        autorLivro.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        assertDoesNotThrow(() -> autorLivro.publicar());
    }
}