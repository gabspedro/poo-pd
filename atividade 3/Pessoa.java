import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private List<Livro> livros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}