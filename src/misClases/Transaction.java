
package misClases;

import java.util.Date;

/**
 * Esta clase representa los movimientos entre cuentas
 *
 * @author Kevin Luis Flórez Lozada
 */
public class Transaction {
    /**
     * ATTRIBUTES
     */
    /**
     * cuenta de origen transacción
     */
    private int sourceAccount;
    /**
     * cuenta de destino transacción
     */
    private int destinationAccount;
    /**
     * monto de la transacción
     */
    private double amount;
    /**
     * fecha de realización de la transacción
     */
    private Date transactionDate;
    
    /**
     * CONSTRUCTORS
     */
    /**
     * default constructor
     */
    public Transaction(){
    }
    
    /**
     * overloaded constructor
     * constructor con todos los atributos de la clase
     * @param sourceAccount cuenta origen tipo int
     * @param destinationAccount cuenta destino tipo int
     * @param amount monto transacción tipo double
     * @param transactionDate fecha de transacción tipo Date
     */
    public Transaction(int sourceAccount, int destinationAccount, double amount, Date transactionDate) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    /**
     * GETTERS AND SETTERS
     */
    /**
     * getter de sourceAccount
     * @return cuenta de origen tipo int
     */
    public int getSourceAccount() {
        return sourceAccount;
    }

    /**
     * setter de sourceAccount
     * @param sourceAccount rrecibe una cuenta tipo int para asignar a this.sourceAccount
     */
    public void setSourceAccount(int sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * getter de destinationAccount
     * @return cuenta destino tipo int
     */
    public int getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * setter de destinationAccount
     * @param destinationAccount rrecibe una cuenta tipo int para asignar a this.destinationAccount
     */
    public void setDestinationAccount(int destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    /**
     * getter de amount
     * @return monto transacción tipo double
     */
    public double getAmount() {
        return amount;
    }

    /**
     * setter de amount
     * @param amount recibe monto tipo double para asignar a this.amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * getter de transactionDate
     * @return fecha de transacción tipo Date
     */
    public Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * setter de transactionDate
     * @param transactionDate recibe una fecha tipo Date para asignar a this.transactionDate
     */
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
  
}
