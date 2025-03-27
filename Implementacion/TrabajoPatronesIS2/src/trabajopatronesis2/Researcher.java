/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author 34651
 */
public class Researcher extends User{
    
    private String ambitoInvestigacion;

    public Researcher(String name, String DNI, String email, String ambitoInvestigacion) {
        super(name, DNI, email);
        this.ambitoInvestigacion = ambitoInvestigacion;
    }

    public String getAmbitoInvestigacion() {
        return ambitoInvestigacion;
    }

    public void setAmbitoInvestigacion(String ambitoInvestigacion) {
        this.ambitoInvestigacion = ambitoInvestigacion;
    }

    //PC: poner bonito y añadir el super()
    
    @Override
    public String toString() {
        return "Researcher{" + "ambitoInvestigacion=" + ambitoInvestigacion + '}';
    }
   
}
