import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Date dataRetirada, Date dataDevolucao, Livro livro, Usuario usuario) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            usuario.getHistoricoEmprestimos().add(this);
        } else {
            livro.validarDisponibilidade();
        }
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
