/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

import java.util.*;

/**
 *
 * @author 34651
 */
public class LibrarySystem {

    private static volatile LibrarySystem instance;

    // Listas para gestión del sistema
    private ArrayList<SimpleUserFactory> users;
    private ArrayList<Book> books;
    private Queue<Loan> loans;

    // Constructor privado para evitar instanciación externa
    private LibrarySystem() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
        this.loans = new LinkedList<>();
    }

    // Método Singleton con doble verificación para thread-safe
    public static LibrarySystem getInstance() {
        return instance;
    }

    public String showUsers() {
        StringBuilder sb = new StringBuilder();
        Iterator<SimpleUserFactory> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next().createUser();
            sb.append("Usuario: ").append(user.getName())
                    .append(", DNI: ").append(user.getDNI())
                    .append(user.getEmail())
                    .append("\n");
        }
        return sb.toString();
    }

    public String showBooks() {
        StringBuilder sb = new StringBuilder();
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            sb.append("Libro: ").append(book.getName())
                    .append(", Autor: ").append(book.getAuthor())
                    .append(", Género: ").append(book.getGenre())
                    .append(", Tipo: ").append(book.getType())
                    .append(", Estado: ").append(book.getState())
                    .append(", ISBN: ").append(book.getISBN())
                    .append("\n");
        }
        return sb.toString();
    }

    public String showLoans() {
        StringBuilder sb = new StringBuilder();
        Iterator<Loan> iterator = loans.iterator();
        while (iterator.hasNext()) {
            Loan loan = iterator.next();
            sb.append("Préstamo: ").append(loan.getBook().getName())
                    .append(" - Usuario: ").append(loan.getUser().getName())
                    .append(" - Inicio del Préstamo: ").append(loan.getLoanStartDate())
                    .append(" - Finalización del Préstamo: ").append (loan.getLoanFinishDate())
                    .append("\n");
        }
        return sb.toString();
    }

    public boolean addUserToSystem(String UserType) {
        Iterator <SimpleUserFactory> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (iterator.getNext().createUser().getDNI().equals(user.getDNI())) {
                return false;
            }
        }
        users.add(new SimpleUserFactory(UserType));
        return true;
    }

    public boolean removeUserFromSystem(User user) {
        Iterator<SimpleUserFactory> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (iterator.getNext().createUser().getDNI().equals(user.getDNI())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean addBookToSystem(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getISBN() == book.getISBN()) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    public boolean removeBookFromSystem(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getISBN() == book.getISBN()) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean addLoanToSystem(Loan loan) {
        if (!loans.contains(loan)) {
            loans.add(loan);
            return true;
        }
        return false;
    }

    public void removeLoanFromSystem(Book book) {
        Iterator <Loan> iterator = loans.iterator();
        while (iterator.hasNext()) {
            Loan loan = iterator.next();
            if (loan.getBook().equals(book)) {
                iterator.remove();
                break;
            }
        }
    }

    public void completeRepair(Book book) {
        book.setState(new AvailableState());
    }

    public void logDamage(Book book, String damageType) {
        book.markAsDamaged();
        System.out.println("Daño registrado: " + damageType + " en " + book.getName());
    }

    public void cancelReservation(Book book, User user) {
        if (book.getState() instanceof ReservedState) {
            book.setState(new AvailableState());
        }
    }

    public Object logDamagedReturn(Book book) {
        return "Libro devuelto dañado: " + book.getName();
    }

}
