/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajopatronesis2;

/**
 *
 * @author Pablo Aranda Cortés
 */


import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una categoría en la jerarquía de libros.
 * Puede contener libros o subcategorías.
 */
public class Category implements IBookComponent 
{
    private String name;
    private List<IBookComponent> children;

    /**
     * Constructor para inicializar una categoría con un nombre.
     * @param name Nombre de la categoría.
     */
    public Category(String name) 
    {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void showDetails() 
    {
        System.out.println("Categoría: " + name);
        for (IBookComponent child : children) 
        {
            child.showDetails();
        }
    }

    @Override
    public List<IBookComponent> getChildren() 
    {
        return children;
    }

    @Override
    public boolean addChild(IBookComponent child) 
    {
        if (!children.contains(child)) {
            return children.add(child);
        }
        return false; // No permite duplicados
    }

    @Override
    public boolean removeChild(IBookComponent child) 
    {
        return children.remove(child);
    }

    /**
     * Obtiene el nombre de la categoría.
     * @return Nombre de la categoría.
     */
    public String getName() 
    {
        return name;
    }
}

