
package misClases;

import java.util.ArrayList;

/**
 * Clase para describir los atributos de una fruta
 *
 * @author Kevin Luis Flórez Lozada
 */
public class Fruit {
    /**
     * ATTRIBUTES
     */
    /**
     * nombre de la fruta
     */
    public String name;
    /**
     * peso promedio de la fruta
     */
    private float averageWeight;
    /**
     * listado de colores de la fruta
     */
    public ArrayList<String> colors;
 
    /**
     * CONSTRUCTORS
     */
    /**
     * default constructor
     */
    public Fruit(){
    }

    /**
     * overloaded constructor
     * constructor con los tres atributos de la clase
     * @param name nombre fruta tipo String
     * @param averageWeight peso promedio tipo float
     * @param colors colores un ArrayList tipo String
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter de name
     * @return nombre de la fruta tipo String
     */
    public String getName() {
        return name;
    }

    /**
     * setter de name
     * @param name recibe un nombre tipo String para asignar a this.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter de averageWeight
     * @return peso promedio tipo float
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * setter de averageWeight
     * @param averageWeight recibe un peso tipo float para asignar a this.averageWeight
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * getter de colors
     * @return listado de colores tipo String
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * setter de colors
     * @param colors recibe un listado de colores tipo String para asignar a this.color
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
