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
        System.out.println("El libro ya está prestado a " + borrower.getName());
    }

    @Override
    public void returnBook(Book book, Loan loan) {
        // 1. Cambiar estado a AvailableState
        book.setState(new AvailableState());

        // 2. Eliminar préstamo del sistema (Singleton)
        LibrarySystem.getInstance().removeLoanFromSystem(loan);

        // 3. Notificar disponibilidad (Observer)
        book.notifyObservers("Libro disponible: " + book.getName());
    }

    @Override
    public void reserve(Book book, User user) {
        // No se puede reservar un libro prestado
        System.out.println("No se puede reservar un libro en préstamo");
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
