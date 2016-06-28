package dao;
import java.util.List;
import model.Livro;

public interface InterfaceLivrosDAO {

    void atualizar(Livro livro) throws LivrariaDAOException;

    void excluir(Livro livro) throws LivrariaDAOException;

    void salvar(Livro livro) throws LivrariaDAOException;

    List<Livro> todosLivros() throws LivrariaDAOException;

    Livro procurarLivro(int isbn) throws LivrariaDAOException;
}
