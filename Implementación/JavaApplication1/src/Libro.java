/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author pablo
 */
public interface Libro
{
    //Subclases: Libro_Físico, Ebook
    String getTitulo();
    String getAutor();
    int getAnyo();
    String getIMEI();
    void mostrarInformacion();
}
