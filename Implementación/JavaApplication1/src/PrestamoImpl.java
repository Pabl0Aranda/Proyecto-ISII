/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.*;
/**
 *
 * @author pablo
 */
public class PrestamoImpl implements Prestamo
{
    private Usuario usuario;
    private Libro libro;
    private LocalDateTime fechaPrestamo; 
    private LocalDateTime fechaDevolucion;

    public PrestamoImpl(Usuario usuario, Libro libro, LocalDate fechaPrestamo, Instant fechaDevolucion) 
    {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = LocalDateTime.now();
        setFechaDevolucion();
    }
    
    public Usuario getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    public Libro getLibro() 
    {
        return libro;
    }

    public void setLibro(Libro libro) 
    {
        this.libro = libro;
    }

    public LocalDateTime getFechaPrestamo() 
    {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) 
    {
        this.fechaPrestamo = LocalDateTime.now();
    }

    public LocalDateTime getFechaDevolucion() 
    {
        return fechaDevolucion;
    }

    public void setFechaDevolucion() 
    {
        this.fechaDevolucion = getFechaPrestamo().plusDays(30);
    }
    
    
}
