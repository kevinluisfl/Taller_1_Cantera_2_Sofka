
package misClases;

/**
 * Clase para atributos de cuenta bancaria
 *
 * @author Kevin Luis Flórez Lozada
 */
public class BankAccount {
    /**
     * ATTRIBUTES
     */
    /**
     * numero de cuenta
     */
    private int accountNumber;
    /**
     * estado de la cuenta
     */
    protected boolean activated;
    
    /**
     * CONSTRUCTORS
     */
    
    /**
     * default constructor
     */
    public BankAccount(){
    }

    /**
     * overloaded constructor
     * constructor con los dos atributos de la clase
     * @param accountNumber numero de cuenta tipo int
     * @param activated estado de cuenta tipo boolean
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter de accountNumber
     * @return el numero de cuenta tipo int
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * setter de accountNumber
     * @param accountNumber recibe un numero de cuenta tipo int para asignar a this.accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * getter de activated
     * @return el estado de cuenta tipo boolean
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * setter de activated
     * @param activated recibe un estado tipo boolean para asignar a this.activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }  
    
}
