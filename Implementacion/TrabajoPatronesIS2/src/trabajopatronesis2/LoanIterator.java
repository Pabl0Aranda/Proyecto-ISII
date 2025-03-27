/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author Pablo Monda Caña
 */

import java.util.*;

class LoanIterator extends Iterator {
    private Queue<Object> queue;

    public LoanIterator(ConcreteCollection collection) {
        super(collection);
        this.queue = new LinkedList<>(); //Esto hay que arreglarlo ya que no se puede dejar como una lista vacia
    }

    @Override
    public Object getNext() {
        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}