
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer {
    String name;


    public Customer(String name) {
        this.name = name;
    }

    /**
     * Getter for customer's name.
     *
     * @return customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * Calls a customer and says a message.
     *
     * @param message message to tell the customer
     */
    public void call(String message) {
        System.out.println("Called " + name);
    }

}
