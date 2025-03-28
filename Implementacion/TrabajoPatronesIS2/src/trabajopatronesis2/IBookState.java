/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author Pablo Aranda Cortés
 */
public interface IBookState 
{
    void borrow(Book book, User user);
    void returnBook(Book book, Loan loan); // Añadido parámetro Book
    void reserve(Book book, User user); // Añadido parámetro Book
    void markAsDamaged(Book book);
    boolean isAvailable();
}
