/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

import java.util.*;

/**
 *
 * @author Pablo
 */
public class LibrarySystem {

    private ArrayList<SimpleUserFactory> users;
    private ArrayList<Book> books;
    private Queue<Loan> loans;
    private static LibrarySystem instance;

    // Constructor privado para Singleton
    private LibrarySystem() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
        this.loans = new LinkedList<>();
    }

    // Método Singleton
    public static LibrarySystem getInstance() {
        if (instance == null) {
            instance = new LibrarySystem();
        }
        return instance;
    }

    // Métodos para mostrar información
    public String showUsers(ArrayList<SimpleUserFactory> users) {
        return users.toString();
    }

    public String showBooks(ArrayList<Book> books) {
        return books.toString();
    }

    public String showLoans(Queue<Loan> loans) {
        return loans.toString();
    }

    // Métodos de gestión de usuarios
    public boolean addUserToSystem(SimpleUserFactory user) {
        return users.add(user);
    }

    public boolean removeUserFromSystem(SimpleUserFactory user) {
        return users.remove(user);
    }

    // Métodos de gestión de libros
    public boolean addBookToSystem(Book book) {
        return books.add(book);
    }

    public boolean removeBookFromSystem(Book book) {
        return books.remove(book);
    }

    // Métodos de gestión de préstamos
    public boolean addLoanToSystem(Loan loan) {
        return loans.add(loan);
    }

    public boolean removeLoanFromSystem(Loan loan) {
        return loans.remove(loan);
    }

    // Getters para las listas (no especificados en el diagrama pero útiles)
    public ArrayList<SimpleUserFactory> getUsers() {
        return users;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Queue<Loan> getLoans() {
        return loans;
    }

    public void cancelReservation(Book book, User reservedUser) {
        IBookState currentState = book.getState();
        if (currentState instanceof ReservedState) {
            ReservedState reservedState = (ReservedState) currentState;
            if (reservedState.getReservedUser().equals(reservedUser)) {
                book.setState(new AvailableState());
            } else {
                System.out.println("El usuario no coincide con la reserva");
            }
        } else {
            System.out.println("El libro no está en estado reservado");
        }
    }

    public void logDamagedReturn(Book book) {
        IBookState currentState = book.getState();
        if (currentState instanceof BorrowedState) {
            currentState.returnBook(book, null);
            book.setState(new DamagedState());
        } else {
            System.out.println("El libro debe estar prestado para marcar daño");
        }
    }

    public void completeRepair(Book book) {
        IBookState currentState = book.getState();
        if (currentState instanceof DamagedState) {
            ((DamagedState) currentState).repairBook(book);
            book.setState(new AvailableState());
        } else {
            System.out.println("El libro no está dañado");
        }
    }

    public void logDamage(Book book, String daño_reiterado) {
        IBookState currentState = book.getState();
        if (currentState instanceof DamagedState) {
            ((DamagedState) currentState).markAsDamaged(book);
        }
        book.setState(new DamagedState());
        // Lógica adicional para registrar daño reiterado (ej: en historial del libro/usuario)
        System.out.println("Daño registrado: " + daño_reiterado);
    }

    private static void reserve(User researcher, Book book2) {
        
    }
}
