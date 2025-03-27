/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author Pablo Monda Caña
 */

public interface IIterator {
    
    boolean isIterationState();
    
    void setIterationState(boolean iterationState);
    
    int getActualPosition();
    
    void setActualPosition(int actualPosition);
    
    Object getNext();
    
    Object getPrevious();
    
    boolean hasNext();
    
    boolean hasPrevious();
    
    int actualPosition();
    
}
