import java.util.Objects;

public class Usuario {
    private final long id;
    private final String nome;

    public Usuario(long id, String nome) {
        this.id = id;
        this.nome = Objects.requireNonNull(nome);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\n=============";
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
