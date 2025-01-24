import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Livro> getObrasPublicadas() {
        return getLivros();
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> livrosPorGenero = new ArrayList<>();
        for (Livro livro : getLivros()) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                livrosPorGenero.add(livro);
            }
        }
        return livrosPorGenero;
    }
}