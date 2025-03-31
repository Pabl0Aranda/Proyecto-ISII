/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author 34651
 */
public class User implements IUser{

    private String name;
    private String DNI;
    private String email;

    public User(String name, String DNI, String email) {
        this.name = name;
        this.DNI = DNI;
        this.email = email;
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
    public String getDNI() {
        return this.DNI;
    }

    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
    //poner bonito
    @Override
    public String toString() {
        return "User" + 
                "\n name = " + name 
                + "\n DNI = " + DNI 
                + "\n email = " + email;
    }
    
    
    
}
