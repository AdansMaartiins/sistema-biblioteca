import java.util.Date;
import java.util.Objects;

public class Emprestimo {
    private final long id;
    private final Livro livro;
    private final Usuario usuario;
    private final Date dataInicio;
    private Date dataFinal;
    private StatusEmprestimo statusEmprestimo;

    public Emprestimo(long id, Livro livro, Usuario usuario, Date dataInicio) {
        this.id = id;
        this.livro = Objects.requireNonNull(livro);
        this.usuario = Objects.requireNonNull(usuario);
        this.dataInicio = Objects.requireNonNull(dataInicio);
        this.dataFinal = null;
        this.statusEmprestimo = StatusEmprestimo.ATIVO;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nLivro: " + livro + "\nUsuário: " + usuario.getNome() + "\nData inicio: " + dataInicio + "\nData final " + dataFinal + "\nStatus: " + statusEmprestimo + "\n=============";
    }

    public long getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public StatusEmprestimo getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void devolver() {
        if(this.statusEmprestimo == StatusEmprestimo.ATIVO) {
            this.statusEmprestimo = StatusEmprestimo.DEVOLVIDO;
            this.dataFinal = new Date();
        } else {
            System.out.println("Empréstimo já foi devolvido");
        }
    }
}