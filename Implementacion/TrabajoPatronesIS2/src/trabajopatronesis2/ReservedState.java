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
public class ReservedState implements IBookState {

    private User reservedUser; // Mejor nombre para clarificar (borrower -> reservedUser)

    public ReservedState(User reservedUser) {
        this.reservedUser = reservedUser; // Constructor para asignar al usuario reservista
    }

    @Override
    public void borrow(Book book, User user) {
        // Solo el usuario que reservó puede prestarlo
        if (user.equals(reservedUser)) {
            // 1. Cambiar a BorrowedState con el usuario
            book.setState(new BorrowedState(user));

            // 2. Crear préstamo con estrategia restringida
            Loan loan = new Loan(user, book, LocalDateTime.now(), new RestrictedLoanStrategy());
            LibrarySystem.getInstance().addLoanToSystem(loan);
        } else {
            throw new IllegalStateException("Solo el usuario reservista (" + reservedUser.getName() + ") puede prestar este libro");
        }
    }

    @Override
    public void returnBook(Book book, Loan loan) {
        // No aplicable: un libro reservado no está prestado
        throw new IllegalStateException("Acción inválida: no se puede devolver un libro reservado");
    }

    @Override
    public void reserve(Book book, User user) {
        // No se permite reserva múltiple
        throw new IllegalStateException("El libro ya está reservado por " + reservedUser.getName());
    }

    @Override
    public void markAsDamaged(Book book) {
        // 1. Cambiar a DamagedState
        book.setState(new DamagedState());

        // 2. Cancelar reserva y notificar
        LibrarySystem.getInstance().cancelReservation(book, reservedUser);
        book.notifyObservers("Libro dañado: " + book.getName());
    }

    @Override
    public boolean isAvailable() {
        return false; // No está disponible para préstamo general
    }

    // Método adicional para acceso al usuario reservista
    public User getReservedUser() {
        return reservedUser;
    }
}
