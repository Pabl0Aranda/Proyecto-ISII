/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

import trabajopatronesis2.BookIterator;

/**
 *
 * @author Pablo Monda Caña
 */

public class SimpleIteratorFactory {
    public static Iterator createIterator(String type, ConcreteCollection collection) {
        switch (type.toLowerCase()) {
            case "book":
                return new BookIterator(collection);
            case "user":
                return new UserIterator(collection);
            case "loan":
                return new LoanIterator(collection);
            default:
                throw new IllegalArgumentException("Tipo de iterador no soportado: " + type);
        }
    }
}
