
package main;

import java.util.ArrayList;
import java.util.Date;
import misClases.Customer;
import misClases.Fruit;

/**
 * Clase principal para pruebas de las intancias de las clases
 *
 * @author Kevin Luis Flórez Lozada
 */
public class MainClass {
    public static void main(String[] args) {
       
        /**
         * class Customer
         *  haciendo pruebas de constructor y métodos
         *  insertando una fecha tipo Date específica
         */
        Date birth = new Date(93,8,21);
        
        Customer c1 = new Customer(123,"Kevin", "Flórez", birth);
        
        System.out.println("El cliente: "+c1.getName()+" "+c1.getLastName1()+" Nacio el "+c1.formatDateBirth());
        
        /**
         * class Fruit
         * prueba de constructor y métodos también
         * experimentando uso de ArrayList
         */
        ArrayList<String> colors = new ArrayList();
        
        colors.add("Rojo");
        colors.add("verde");
        colors.add("Amarillo");
        
        Fruit f1 = new Fruit("Manzana", (float) 5.6,colors);
        
        System.out.println("Los colores para la fruta "+f1.getName()+" pueden ser: "+f1.getColors());
        
    }
}
