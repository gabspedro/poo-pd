import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Usuario extends Pessoa {
    private int idade;
    private List<Emprestimo> historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
        this.historicoEmprestimos = new ArrayList<>();
    }

    public int getIdade() {
        return idade;
    }

    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}