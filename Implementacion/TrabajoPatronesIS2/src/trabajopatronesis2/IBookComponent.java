/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajopatronesis2;

import java.util.Collections;
import java.util.List;

/**
 * Interfaz que representa un componente en la estructura de libros.
 * Puede ser un libro individual o una colección de libros.
 * Implementa el patrón Composite.
 * 
 * @author Pablo Aranda Cortés
 */
public interface IBookComponent 
{
    
    /**
     * Muestra los detalles del componente (puede ser un libro o una colección).
     */
    void showDetails();

    /**
     * Obtiene la lista de hijos de este componente.
     * En caso de ser un libro individual, la lista estará vacía.
     * 
     * @return Lista de componentes hijos.
     */
    default List<IBookComponent> getChildren() 
    {
        return Collections.emptyList(); // Retorna una lista vacía en vez de null
    }

    /**
     * Agrega un componente hijo.Por defecto lanza una excepción si la implementación no soporta hijos.
     * 
     * @param child Componente hijo a agregar.
     * @return
     */
    boolean addChild(IBookComponent child);

    /**
     * Elimina un componente hijo.Por defecto lanza una excepción si la implementación no soporta hijos.
     * 
     * @param child Componente hijo a eliminar.
     * @return 
     */
    boolean removeChild(IBookComponent child);
}
