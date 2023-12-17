import java.util.ArrayList;
import java.util.Date;

/**
 * A showing of a movie.
 *
 * @author Ashlyn Balicki
 */
public class Show {
    Theater theater;
    Movie movie;
    Date time;
    ShowingSeat[] showingSeats;

    public Show(Theater theater, Movie movie, Date time) {
        this.theater = theater;
        this.movie = movie;
        this.time = time;
    }

    /**
     * Reserves a showingSeat in the system.
     *
     * @param showingSeat showingSeat to get reserved
     */
    public void reserve(ShowingSeat showingSeat) {
        System.out.println("ShowingSeat reserved!");
    }

    /**
     * Unreserves a showingSeat in the system.
     *
     * @param showingSeat showingSeat to unreserve
     */
    public void cancelReservation(ShowingSeat showingSeat) {
        System.out.println("ShowingSeat unreserved!");
    }

    /**
     * Checks if a showingSeat is reserved.
     *
     * @param showingSeat showingSeat to check
     * @return if the showingSeat is reserved
     */
    public boolean isSeatReserved(ShowingSeat showingSeat) {
        return showingSeat.isReserved();
    }

    /**
     * Getter for showingSeats in the showing.
     *
     * @return showingSeats in the showing
     */
    public ShowingSeat[] getSeats() {
        return showingSeats;
    }

    /**
     * Getter for movie details.
     *
     * @return movie details
     */
    public String getDetails() {
        return movie.getDetails();
    }

    /**
     * Getter for time of the showing.
     *
     * @return time of the showing
     */
    public Date getTime() {
        return time;
    }

    /**
     * Gets all the customers in the show.
     *
     * @return customers in the show
     */
    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        for (ShowingSeat showingSeat : getSeats()) {
            Customer customer = showingSeat.getReservee();
            if (!customers.contains(customer)) {
                customers.add(customer);
            }
        }
        return customers;
    }

    /**
     * Getter for theater
     *
     * @return theater
     */
    public Theater getTheater() {
        return theater;
    }
}
