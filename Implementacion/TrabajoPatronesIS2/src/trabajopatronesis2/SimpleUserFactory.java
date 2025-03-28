/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author pablo
 */

public class SimpleUserFactory {
    public User createUser(String userType) {
        if (userType == null) {
            throw new IllegalArgumentException("Tipo de usuario no puede ser null");
        }
        switch (userType.toLowerCase()) {
            case "student":
                return new Student("", "", "", "");
            case "professor":
                return new Professor("", "", "", "");
            case "researcher":
                return new Researcher("", "", "", "");
            default:
                throw new IllegalArgumentException("Tipo de usuario no válido: " + userType);
        }
    }
}