/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author 34651
 */
public class Researcher extends User implements IObserver {
    
    private String researchArea;

    public Researcher(String name, String DNI, String email, String researchArea) {
        super(name, DNI, email);
        this.researchArea = researchArea;
    }

    public String getAmbitoInvestigacion() {
        return researchArea;
    }

    public void setAmbitoInvestigacion(String researchArea) {
        this.researchArea = researchArea;
    }

    //PC: poner bonito y añadir el super()

    @Override
    public void update(Book book, String message) {
        System.out.println("[NOTIFICACIÓN] " + getName() + ": " + message);
    }
}
