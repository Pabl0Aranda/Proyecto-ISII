/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

import java.util.List;

/**
 *
 * @author Pablo Aranda Cortés
 */

public class Book implements IBook, IBookComponent 
{

    private String name;
    private String author; 
    private String genre;
    private String type;
    private long ISBN;
    private boolean disponibility;

    public Book(String name, String author, String genre, String type, int ISBN, boolean disponibility) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.type = type;
        this.ISBN = ISBN;
        this.disponibility = disponibility;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public long getISBN() {
        return this.ISBN;
    }

    @Override
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean isAvailable() {
        return this.disponibility;
    }

    @Override
    public void setAvailable(boolean disponibility) {
        this.disponibility = disponibility;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name 
                + ", author=" + author 
                + ", genre=" + genre 
                + ", type=" + type 
                + ", ISBN=" + ISBN 
                + ", disponibility=" + disponibility 
                + '}';
    }

    @Override
    public void showDetails() 
    {
        
    }

    @Override
    public List<IBookComponent> getChildren() 
    {
        
    }

    @Override
    public boolean addChild(IBookComponent child) 
    {
        
    }

    @Override
    public boolean removeChild(IBookComponent child) 
    {
        
    }
}
