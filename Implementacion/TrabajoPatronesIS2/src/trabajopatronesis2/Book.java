
package trabajopatronesis2;

public class Book implements IBook{

    private String name;
    private String author; 
    private String genre;
    private String type;
    private int ISBN;
    private boolean disponibility;

    public Book(String name, String author, String genre, String type, int ISBN, boolean disponibility) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.type = type;
        this.ISBN = ISBN;
        this.disponibility = disponibility;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getISBN() {
        return this.ISBN;
    }

    @Override
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean IsAvaleible() {
        return this.disponibility;
    }

    @Override
    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }

    //poner bonito
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", genre=" + genre + ", type=" + type + ", ISBN=" + ISBN + ", disponibility=" + disponibility + '}';
    }
        
}
