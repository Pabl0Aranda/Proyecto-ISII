/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

import java.time.LocalDateTime;

/**
 *
 * @author pablo
 */
public class AvailableState implements IBookState 
{
    @Override
    public void borrow(Book book, User user) 
    {
            // 1. Cambiar estado a BorrowedState con el usuario
            book.setState(new BorrowedState(user));
            
            // 2. Crear préstamo usando Strategy
            Loan loan = new Loan(user, book, LocalDateTime.now(), null/*book.getLoanStrategy()*/); //Preguntar por implementación
            
            // 3. Añadir préstamo al sistema (Singleton)
            LibrarySystem.getInstance().addLoanToSystem(loan);
    }

    @Override
    public void returnBook(Book book) 
    {
        // No aplicable: ¡un libro disponible no puede devolverse!
        throw new IllegalStateException("El libro ya está disponible");
    }

    @Override
    public void reserve(Book book, User user) 
    {
        // 1. Cambiar a ReservedState con el usuario
        book.setState(new ReservedState(user));
        
        // 2. Notificar al usuario vía Observer (ej: email)
        book.notifyObservers("Libro reservado: " + book.getName());
    }

    @Override
    public void markAsDamaged(Book book) 
    {
        // 1. Cambiar estado a DamagedState
        book.setState(new DamagedState());
    }

    @Override
    public boolean isAvailable() 
    {
        return true; // Estado actual = disponible
    }
}
