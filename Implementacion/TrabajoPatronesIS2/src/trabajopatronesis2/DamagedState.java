/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author pablo
 */
public class DamagedState implements IBookState {

    @Override
    public void borrow(Book book, User user) {
        throw new IllegalStateException("No se puede prestar un libro dañado: " + book.getName());
    }

    @Override
    public void returnBook(Book book, Loan loan) {
        // Permitir devolución para cambiar estado (ej: tras reparación)
        // Opcional: registrar devolución de libro dañado
        LibrarySystem.getInstance().logDamagedReturn(book);
    }

    @Override
    public void reserve(Book book, User user) {
        throw new IllegalStateException("No se puede reservar un libro dañado");
    }

    @Override
    public void markAsDamaged(Book book) {
        // Ya está dañado: registrar incidente adicional
        LibrarySystem.getInstance().logDamage(book, "Daño reiterado");
        book.notifyObservers("Daño crítico en libro: " + book.getName());
    }

    @Override
    public boolean isAvailable() {
        return false; // Nunca está disponible
    }

    // Método adicional para reparar el libro
    public void repairBook(Book book) {
        book.setState(new AvailableState());
        LibrarySystem.getInstance().completeRepair(book);
    }
}
