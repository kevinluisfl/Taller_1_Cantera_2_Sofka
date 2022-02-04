
package misClases;

import java.util.Date;

/**
 * Clase con atributos especificos de cliente, hereda otros atributos de la clase Person
 *
 * @author Kevin Luis Flórez Lozada
 */
public class Customer extends Person {
    /**
     * ATTRIBUTES
     */
    /**
     * documento de identificacion del cliente
     */
    private int document;
    /**
     * tipo de cliente que se registra
     */
    protected String customerType;
    /**
     * fecha en que se hace el registro del cliente
     */
    private Date registration;
    
    /**
     * CONSTRUCTORS
     */
    /**
     * default constructor
     */
    public Customer(){
    }

    /**
     * overloaded constructor
     * constructor con dos de los parametros propios de la clase
     * @param document docmento de identidad tipo int
     * @param customerType tipo cliente tipo String
     */
    public Customer(int document, String customerType) {
        this.document = document;
        this.customerType = customerType;
    }

    /**
     * overloaded constructor
     * constructor con un atributo propio de la clase y tres heredados de la clase padre
     * @param document documento identidad tipo int
     * @param name nombre de la persona tipo String (heredado)
     * @param lastName1 primer apellido de la persona tipo String (heredado) 
     * @param dateBirth fecha nacimiento persona tipo Date (heredado)
     */
    public Customer(int document, String name, String lastName1, Date dateBirth) {
        super(name, lastName1, dateBirth);
        this.document = document;
    }

    /**
     * GETTERS AND SETTERS
     */
    
    /**
     * getter de document
     * @return documento tipo int
     */
    public int getDocument() {
        return document;
    }

    /**
     * setter de document
     * @param document recibe un numero de docmento tipo int y lo asigna a this.document
     */
    public void setDocument(int document) {
        this.document = document;
    }

    /**
     * getter de customerType
     * @return la clase del cliente tipo String
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * setter de customerType
     * @param customerType recibe el tipo de cliente tipo String y lo asigna a this.customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * getter de registration
     * @return la fecha de registro tipo Date
     */
    public Date getRegistration() {
        return registration;
    }

    /**
     * setter de registration
     * @param registration recibe una fecha tipo Date y asigna el valor a this.registration
     */
    public void setRegistration(Date registration) {
        this.registration = registration;
    }
 
}
