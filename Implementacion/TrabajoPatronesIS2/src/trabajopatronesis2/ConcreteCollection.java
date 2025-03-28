/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author Pablo Monda Caña
 */

import java.util.List;
import java.util.ArrayList;

public class ConcreteCollection implements IterableCollection {

    public ConcreteCollection(ArrayList<Book> books) {
    }
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator CreateIterator() {
        return new Iterator(this, false, 0);
    }

    public void addItem(Object item) {
        items.add(item);
    }

    public Object getItem(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }
}
