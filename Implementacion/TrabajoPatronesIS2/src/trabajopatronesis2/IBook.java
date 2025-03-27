
package trabajopatronesis2;

public interface IBook {
    
    String getName();
    void setName(String name);
    String getGenre();
    void setGenre(String genre);
    int getISBN();
    void setISBN(int ISBN);
    boolean IsAvaleible();
    void setDisponibility(boolean disponibility);
}
