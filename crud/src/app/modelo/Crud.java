package app.modelo;

import java.util.Map;

public interface Crud {
    //Mostrar Todos
    public Map<Integer, Producto>
    seleccionarTodo();
    //Mostrar uno
    public Producto buscar(int id);
    //Insertar
    public void insertar(Producto producto);
    //Actualizar
    public void actualizar(Producto producto);
    //Eliminar
    public void eliminar(int id);
}
