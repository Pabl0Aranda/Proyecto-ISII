/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author pablo
 */
public class BorrowedState implements IBookState {

    private User borrower;

    public BorrowedState(User borrower) {
        this.borrower = borrower; // Constructor para asignar al prestatario
    }

    @Override
    public void borrow(Book book, User user) {
        // No se puede prestar un libro ya prestado
        throw new IllegalStateException("El libro ya está prestado a " + borrower.getName());
    }

    @Override
    public void returnBook(Book book) {
        // 1. Cambiar estado a AvailableState
        book.setState(new AvailableState());

        // 2. Eliminar préstamo del sistema (Singleton)
        LibrarySystem.getInstance().removeLoanFromSystem(book);

        // 3. Notificar disponibilidad (Observer)
        book.notifyObservers("Libro disponible: " + book.getName());
    }

    @Override
    public void reserve(Book book, User user) {
        // No se puede reservar un libro prestado
        throw new IllegalStateException("No se puede reservar un libro en préstamo");
    }

    @Override
    public void markAsDamaged(Book book) {
        // 1. Cambiar estado a DamagedState
        book.setState(new DamagedState());
    }

    @Override
    public boolean isAvailable() {
        return false; // No está disponible
    }

    // Método adicional para obtener al prestatario
    public User getBorrower() {
        return borrower;
    }
}
