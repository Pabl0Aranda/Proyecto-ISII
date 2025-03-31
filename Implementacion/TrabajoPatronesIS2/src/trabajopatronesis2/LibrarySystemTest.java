/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author pablo
 */
import java.time.LocalDateTime;

public class LibrarySystemTest {

    private static User student;
    private static User professor;
    private static User researcher;
    private static Book book1;
    private static Book book2;

    public static void main(String[] args) {
        // Configuración inicial del sistema
        LibrarySystem library = LibrarySystem.getInstance();
        SimpleUserFactory userFactory = new SimpleUserFactory();

        // ========== PRUEBA 1: Creación de usuarios ==========
        try {
            student = userFactory.createUser("Student");
            student.setName("Ana Perez"); // Ahora student no es null
            student.setDNI("123456789A");
            student.setEmail("Ana@gmail.com");

            professor = userFactory.createUser("Professor");
            professor.setName("Dr. Garcia");
            professor.setDNI("987654321B");
            professor.setEmail("DRGarcia@gmail.com");

            researcher = userFactory.createUser("Researcher");
            researcher.setName("Investigador Lopez");
            professor.setDNI("091287346C");
            professor.setEmail("Lopez@gmail.com");

            // Añadir usuarios al sistema
            library.addUserToSystem(userFactory);
            System.out.println("Usuarios creados correctamente.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error al crear usuarios: " + e.getMessage());
        }

        // ========== PRUEBA 2: Gestión de libros ==========
        System.out.println("\n=== Anadiendo libros ===");
        book1 = new Book("Cien años de soledad", "Garcia Márquez", "Novela", "Fisico", 123456, true);
        book2 = new Book("Fisica Cuantica", "Stephen Hawking", "Ciencia", "E-Book", 789012, true);

        library.addBookToSystem(book1);
        library.addBookToSystem(book2);
        System.out.println("Libros en sistema: " + library.showBooks(library.getBooks()));

        // ========== PRUEBA 3: Préstamos con diferentes estrategias ==========
        System.out.println("\n=== Prestamos con estrategias ===");

        // Asegurar que los objetos no sean null
        ILoanStrategy standard = new StandardLoanStrategy();
        Loan loan1 = new Loan(student, book1, LocalDateTime.now(), standard);
        library.addLoanToSystem(loan1);

        // Intentar prestar libro disponible
        try {
            book1.getState().borrow(book1, student);
            System.out.println("Estado libro1: " + book1.getState().getClass().getSimpleName());
        } catch (IllegalStateException e) {
            System.err.println("Error al prestar: " + e.getMessage());
        }

        // Intentar prestar libro disponible
        book1.getState().borrow(book1, student);
        System.out.println("Estado libro1: " + book1.getState().getClass().getSimpleName());

        // ========== PRUEBA 4: Sistema de reservas ==========
        System.out.println("\n=== Reserva de libro ===");
        System.out.println("Estado libro2: " + book2.getState().getClass().getSimpleName());

        // ========== PRUEBA 5: Notificaciones Observer ==========
        System.out.println("\n=== Prueba Observer ===");
        Researcher obs = new Researcher("Pablo", "21234538A", "Pablo@gmail.com", "Fisica");
        book2.registerObserver(obs);
        book2.setState(new AvailableState());  // Debería notificar al investigador

        // ========== PRUEBA 6: Daño y reparación ==========
        System.out.println("\n=== Prueba daños ===");
        library.logDamagedReturn(book1);
        System.out.println("Estado libro1 dañado: " + book1.getState().getClass().getSimpleName());
        library.completeRepair(book1);
        System.out.println("Estado despues de reparación: " + book1.getState().getClass().getSimpleName());
/*
        // ========== PRUEBA 7: Iteradores ==========
        System.out.println("\n=== Prueba iteradores ===");
        SimpleIteratorFactory iteratorFactory = new SimpleIteratorFactory();
        IIterator bookIterator = iteratorFactory.createIterator("Book", new ConcreteCollection(library.getBooks()));

        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.getNext();
            System.out.println("Libro: " + book.getName());
        }
    */}
}