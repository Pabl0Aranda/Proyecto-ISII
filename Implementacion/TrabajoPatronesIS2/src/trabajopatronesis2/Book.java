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
public class Book implements IBook, ISubject {

    private List<IObserver> observers = new ArrayList<>();
    private String name;
    private String author;
    private String genre;
    private String type;
    private long ISBN;
    private IBookState currentState;

    public Book(String name, String author, String genre, String type, int ISBN, boolean disponibility) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.type = type;
        this.ISBN = ISBN;
        this.currentState = disponibility ? new AvailableState() : new BorrowedState(null);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public IBookState getState() {
        return currentState;
    }

    @Override
    public void setState(IBookState newState) {
        this.currentState = newState;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name
                + ", author=" + author
                + ", genre=" + genre
                + ", type=" + type
                + ", ISBN=" + ISBN
                + '}';
    }

    // Métodos de ISubject
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(this, message); // Notificar con el libro y un mensaje
        }
    }

    public void markAsDamaged() {
        // 1. Cambiar estado a DamagedState
        this.currentState = new DamagedState();

        // 2. Registrar daño en el sistema (Singleton)
        LibrarySystem.getInstance().logDamage(this, "Daño reportado");

        // 3. Notificar a observadores (Observer pattern)
        notifyObservers("Libro dañado: " + this.getName());
    }
}
