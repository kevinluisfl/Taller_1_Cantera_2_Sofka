
package misClases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase que describe los atributos de una persona
 *
 * @author Kevin Luis Flórez Lozada
 */
public class Person {
    /**
     * ATTRIBUTES
     */
    /**
     * nombre de la persona
     */
    public String name;
    /**
     * primer apellido de la persona
     */
    public String lastName1;
    /**
     * segundo apellido de la persona
     */
    public String lastName2;
    /**
     * fecha de nacimiento de la persona
     */
    public Date dateBirth;
    /**
     * altura de la persona
     */
    public float height;

    /**
     * CONSTRUCTORS
     */
    /**
     * default constructor
     */
    public Person() {
    }

    /**
     * overloaded constructor
     * constructor que recibe dos parametros
     * @param name nombre de la persona tipo String
     * @param lastName1 primer apellido de la persona tipo String
     */
    public Person(String name, String lastName1) {
        this.name = name;
        this.lastName1 = lastName1;
    }
    /**
     * overloaded constructor
     * constructor que recibe tres parametros
     * @param name nombre de la persona tipo String
     * @param lastName1 primer apellido de la persona tipo String
     * @param dateBirth fecha de nacimiento de la persona tipo Date
     */
    public Person(String name, String lastName1, Date dateBirth) {
        this.name = name;
        this.lastName1 = lastName1;
        this.dateBirth = dateBirth;
    }

    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter de name
     * @return nonbre de la persona tipo String
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
     * getter de lastName1
     * @return primer apellido de la persona tipo String
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * setter de lastName1
     * @param lastName1 recibe un apellido tipo String para asignar a this.lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * getter de lastName2
     * @return segundo apellido de la persona tipo String
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * setter de lastName2
     * @param lastName2 recibe un apellido tipo String para asignar a this.lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * getter de dateBirth
     * @return fecha de nacimiento tipo Date
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * setter de dateBirth
     * @param dateBirth recibe una fecha tipo Date para asignar a this.dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * getter de height
     * @return altura de la persona tipo float
     */
    public float getHeight() {
        return height;
    }

    /**
     * setter de height
     * @param height recibe una altura tipo float para asignar a this.height
     */
    public void setHeight(float height) {
        this.height = height;
    }
    
    
    /**
     * Método para formatear la fecha de nacimiento a un String más legible
     * @return la fecha de nacimiento formateada tipo String
     */
    public String formatDateBirth(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = sdf.format(this.dateBirth);
        return dateFormat;
    }
    
}
