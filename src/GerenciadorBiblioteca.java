import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciadorBiblioteca {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Emprestimo> emprestimos = new ArrayList<>();
    private long contadorEmprestimos = 0;

    //busca por id
    public Livro buscarPorIdLivro(long id){
        for(Livro l : livros){
            if(l.getId() == id){
                return l;
            }
        }
        return null;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public boolean livroEstaEmprestado(Livro livro){
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.getLivro() == livro &&  emprestimo.getStatusEmprestimo() == StatusEmprestimo.ATIVO){
                return true;
            }
        }
        return false;
    }

    public Usuario buscarPorIdUsuario(long id){
        for(Usuario u : usuarios){
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }

    public boolean emprestarLivro(long idLivro, long idUsuario){
        Livro livroEncontrado = buscarPorIdLivro(idLivro);
        Usuario usuarioEncontrado = buscarPorIdUsuario(idUsuario);
        if(livroEncontrado == null){
            return false;
        }
        if(usuarioEncontrado == null){
            return false;
        }
        if(livroEstaEmprestado(livroEncontrado)){
            return false;
        }
        Emprestimo novoEmprestimo = new Emprestimo(contadorEmprestimos++,livroEncontrado,usuarioEncontrado,new Date());
        emprestimos.add(novoEmprestimo);
        return true;
    }

    public boolean devolverLivro(long idLivro){
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.getLivro().getId() == idLivro && emprestimo.getStatusEmprestimo() == StatusEmprestimo.ATIVO){
                emprestimo.devolver();
                return true;
            }
        }
        return false;
    }
}
