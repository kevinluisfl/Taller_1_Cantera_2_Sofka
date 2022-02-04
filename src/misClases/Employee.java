
package misClases;

import java.util.Date;

/**
 * Clase con atributos especificos de empleado, hereda otros atributos de la clase Person
 *
 * @author Kevin Luis Flórez Lozada
 */
public class Employee extends Person {
    /**
     * ATTRIBUTES
     */
    /**
     * código de identificación del empleado
     */
    private int code;
    /**
     * puesto que ocupa el empleado
     */
    protected String position;
    /**
     * fecha en que se contrata al empleado
     */
    private Date contracting;
    
    /**
     * CONSTRUCTORS
     */
    /**
     * default constructor
     */
    public Employee(){
    }
    
    /**
     * overloaded constructor
     * constructor con dos atributos de la clase padre y sus tres atributos propios
     * @param code código de empleado tipo int
     * @param position puesto del empleado tipo String
     * @param contracting fecha de contratación tipo Date
     * @param name nombre de la persona tipo String (heredado)
     * @param lastName1 primer apellido de la persona tipo String (heredado)
     */
    public Employee(int code, String position, Date contracting, String name, String lastName1) {
        super(name, lastName1);
        this.code = code;
        this.position = position;
        this.contracting = contracting;
    }

    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter de code
     * @return código empleado tipo int
     */
    public int getCode() {
        return code;
    }

    /**
     * setter de code
     * @param code recibe un código tipo int para asignar a this.code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * getter de position
     * @return  puesto del empleado tipo String
     */
    public String getPosition() {
        return position;
    }

    /**
     * setter de position
     * @param position recibe un puesto que ocupa el empleado tipo String para asignar a this.position 
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * getter de contracting
     * @return fecha de contratación tipo Date
     */
    public Date getContracting() {
        return contracting;
    }

    /**
     * setter de contracting
     * @param contracting recibe una fecha tipo Date para asignar a this.contracting
     */
    public void setContracting(Date contracting) {
        this.contracting = contracting;
    }
 
}
