import java.util.ArrayList;

/**
 * A representation of customers in the system
 *
 * @author Ashlyn Balicki
 */
public class Customer {
    private String name;
    private ArrayList<ShowingSeat> reservations;
    private String phoneNumber;

    public Customer(String name) {
        this.name = name;
        reservations = new ArrayList<>();
    }

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        reservations = new ArrayList<>();
    }

    /**
     * Notifies a customer.
     *
     * @param message message to tell the customer
     */
    public void notify(String message) {
        if (phoneNumber == null) {
            System.out.println(name + " has no phone number!");
        }
        System.out.println("To " + name + ": " + message);
    }

    /**
     * Getter for reservations
     *
     * @return customer's reservations
     */
    public ArrayList<ShowingSeat> getReservations() {
        return reservations;
    }

    /**
     * Getter for reservations for a show
     *
     * @param show show
     * @return reservations for a show
     */
    public ArrayList<ShowingSeat> getReservations(Show show) {
        ArrayList<ShowingSeat> showSeats = new ArrayList<>();
        for (ShowingSeat seat : reservations) {
            if (seat.getShow().equals(show)) {
                showSeats.add(seat);
            }
        }
        return showSeats;
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
     * Setter for customer's name.
     *
     * @param name customer's new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for phone number.
     *
     * @return phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for phone number.
     *
     * @param phoneNumber new phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Removes phone number.
     */
    public void removePhoneNumber() {
        this.phoneNumber = null;
    }
}
