import java.util.Objects;

public class Livro {
    private final long id;
    private final String titulo;
    private final String autor;
    private final Secao secao;

    public Livro(long id, String titulo, String autor, Secao secao) {
        this.id = id;
        this.titulo = Objects.requireNonNull(titulo);
        this.autor = Objects.requireNonNull(autor);
        this.secao = Objects.requireNonNull(secao);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nTítulo: " + titulo + "\nAutor: " + autor + "\nSeção: " + secao + "\n=============";
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Secao getSecao(){
        return secao;
    }
}


