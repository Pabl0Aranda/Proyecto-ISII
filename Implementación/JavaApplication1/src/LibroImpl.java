/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class LibroImpl implements Libro
{
    private String titulo;
    private String autor;
    private String IMEI;
    private int anyo;

    public LibroImpl(String titulo, String autor, String IMEI, int anyo) {
        this.titulo = titulo;
        this.autor = autor;
        this.IMEI = IMEI;
        this.anyo = anyo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    public void mostrarInformacion ()
    {
        System.out.println("Libro:" + 
                "/n titulo=" + this.titulo + 
                "/n autor=" + this.autor + 
                "/n IMEI=" + this.IMEI + 
                "/n anyo=" + this.anyo);
    }
}
