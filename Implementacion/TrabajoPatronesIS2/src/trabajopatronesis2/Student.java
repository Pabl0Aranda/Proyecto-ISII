/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author 34651
 */

public class Student extends User {
    private String faculty;

    public Student(String name, String DNI, String email, String faculty) {
        super(name, DNI, email); // Llama al constructor de User
        this.faculty = faculty;
    }

    // Getters y setters para faculty
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
