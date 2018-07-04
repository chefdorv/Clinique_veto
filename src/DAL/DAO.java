package DAL;

public interface DAO<T> {

    public void insert (T data) throws DALException;

    // Sélectionner un business object par son id
    public T read(int id) throws DALException;

    // Modifier les attributs d'un business object
    public void update(T data) throws DALException;

    // Supprimer un business object
    public void delete(T obj) throws DALException;
}
