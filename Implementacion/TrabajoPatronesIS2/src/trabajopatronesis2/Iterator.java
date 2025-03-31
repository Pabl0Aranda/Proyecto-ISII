/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author Pablo Monda Caña
 */

public class Iterator <T> implements IIterator{
    
    private ConcreteCollection collection;
    private boolean iterationState;
    private int actualPosition;

    public Iterator(ConcreteCollection collection, boolean iterationState, int actualPosition) {
        this.collection = collection;
        this.iterationState = iterationState;
        this.actualPosition = actualPosition;
    }
    
    public Iterator (ConcreteCollection collection){
        this.collection = collection;
    }

    @Override
    public boolean isIterationState() {
        return iterationState;
    }

    @Override
    public void setIterationState(boolean iterationState) {
        this.iterationState = iterationState;
    }

    @Override
    public int getActualPosition() {
        return actualPosition;
    }

    public ConcreteCollection getCollection() {
        return collection;
    }

    public void setCollection(ConcreteCollection collection) {
        this.collection = collection;
    }
    
    @Override
    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }    
    
    @Override
    public Object getNext() {
        if (hasNext()) {
            return collection.getItem(actualPosition++);
        }
        return null;
    }

    @Override
    public Object getPrevious() {
        if (hasPrevious()) {
            return collection.getItem(--actualPosition);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return actualPosition < collection.size();
    }

    @Override
    public boolean hasPrevious() {
        return actualPosition > 0;
    }

    @Override
    public int actualPosition() {
        return actualPosition;
    }
    
}
