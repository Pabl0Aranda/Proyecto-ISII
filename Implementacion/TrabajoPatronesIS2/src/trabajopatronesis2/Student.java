/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author 34651
 */
public class Student extends User{
    
    private String facultad;

    public Student(String name, String DNI, String email, String facultad) {
        super(name, DNI, email);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    //PC: poner bonito y añadir el super()
    
    @Override
    public String toString() {
        return "Student{" + "facultad=" + facultad + '}';
    }
    
    
    
    
}
