package DataAccessObject;

import java.util.List;

/**
 *
 * @author Aaron
 */
public interface Crud<T> {
    public List<T> listar();
    public boolean agregar(T obj);
    public boolean actualizar(T obj);
    public boolean eliminar(T obj);
    public T buscar(T obj);
}
