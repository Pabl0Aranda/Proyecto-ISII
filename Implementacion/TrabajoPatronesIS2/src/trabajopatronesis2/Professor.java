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
    
    private String departamento;

    public Professor(String name, String DNI, String email, String departamento) {
        super(name, DNI, email);
        this.departamento = departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }

    //PC: poner bonito y añadir el super()
    
    @Override
    public String toString() {
        return "Professor{" + "departamento=" + departamento + '}';
    }
    
    
}
