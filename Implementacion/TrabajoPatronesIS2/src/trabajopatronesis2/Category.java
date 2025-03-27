/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajopatronesis2;

import java.util.*;

/**
 *
 * @author Pablo Aranda Cortés
 */


/**
 * Clase que representa una categoría en la jerarquía de libros.
 * Puede contener libros o subcategorías.
 */
public class Category {
    private String name;
    private List<Book> books = new ArrayList<>();
    private List<Category> subcategories = new ArrayList<>(); // Lista de subcategorías

    public Category(String name) {
        this.name = name;
    }

    /**
     * Añade una subcategoría si no existe previamente.
     * @param categoryName Nombre de la subcategoría a añadir.
     * @return true si se añadió, false si ya existe.
     */
    public boolean addCategory(String categoryName) 
    {
        if (categoryName == null || categoryName.trim().isEmpty()) 
        {
            return false;
        }
        
        // Verificar si la subcategoría ya existe
        for (Category subcategory : subcategories) 
        {
            if (subcategory.getName().equalsIgnoreCase(categoryName.trim())) 
            {
                return false;
            }
        }
        
        // Crear y añadir la nueva subcategoría
        subcategories.add(new Category(categoryName.trim()));
        return true;
    }

    /**
     * Elimina una subcategoría por nombre.
     * @param categoryName Nombre de la subcategoría a eliminar.
     * @return true si se eliminó, false si no existe.
     */
    public boolean removeCategory(String categoryName) 
    {
        if (categoryName == null || categoryName.trim().isEmpty()) 
        {
            return false;
        }
        
        // Buscar y eliminar la subcategoría
        return subcategories.removeIf(subcategory -> 
            subcategory.getName().equalsIgnoreCase(categoryName.trim())
        );
    }

    // Getters y Setters
    public String getName() 
    {
        return name;
    }

    public List<Book> getBooks() 
    {
        return books;
    }

    public List<Category> getSubcategories() 
    {
        return subcategories;
    }
}
