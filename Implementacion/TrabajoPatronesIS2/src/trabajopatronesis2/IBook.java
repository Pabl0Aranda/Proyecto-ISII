package trabajopatronesis2;

/**
 * Interfaz que define las propiedades de un libro.
 * 
 * @author Pablo Aranda Cortés
 */

public interface IBook {
    
    /**
     * Obtiene el nombre del libro.
     * @return Nombre del libro.
     */
    String getName();

    /**
     * Establece el nombre del libro.
     * @param name Nuevo nombre del libro.
     */
    void setName(String name);

    /**
     * Obtiene el género del libro.
     * @return Género del libro.
     */
    String getGenre();

    /**
     * Establece el género del libro.
     * @param genre Nuevo género del libro.
     */
    void setGenre(String genre);

    /**
     * Obtiene el ISBN del libro.
     * @return Número ISBN del libro.
     */
    long getISBN();

    /**
     * Establece el ISBN del libro.
     * @param ISBN Nuevo número ISBN.
     */
    void setISBN(long ISBN);

    /**
     * Verifica si el libro está disponible.
     * @return `true` si está disponible, `false` en caso contrario.
     */
    boolean isAvailable();

    /**
     * Establece la disponibilidad del libro.
     * @param available Estado de disponibilidad (`true` para disponible, `false` para no disponible).
     */
    void setAvailable(boolean available);
}
