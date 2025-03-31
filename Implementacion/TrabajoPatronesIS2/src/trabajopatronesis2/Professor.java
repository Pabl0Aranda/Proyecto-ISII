/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author 34651
 */
public class Professor extends User{
    
    private String department;

    public Professor(String name, String DNI, String email, String department) {
        super(name, DNI, email);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Professor{" + "departamento=" + department + '}';
    }
    
    
}
