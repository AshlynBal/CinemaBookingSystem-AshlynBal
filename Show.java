import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * A showing of a movie.
 *
 * @author Ashlyn Balicki
 */
public class Show {
    private Theater theater;
    private Movie movie;
    private Date time;
    private HashMap<Seat, ShowingSeat> seats;

    public Show(Theater theater, Movie movie, Date time) {
        this.theater = theater;
        this.movie = movie;
        this.time = time;
        this.seats = new HashMap<>();
        for (Seat seat : theater.getSeats()) {
            seats.put(seat, new ShowingSeat(seat, this));
        }
    }

    /**
     * Marks a seat as reserved in the system.
     *
     * @param showingSeat seat to get reserved
     */
    public void reserve(ShowingSeat showingSeat) {
        System.out.println("Seat now reserved in system");
    }

    /**
     * Marks one or more seats as reserved in the system.
     *
     * @param reserveSeats seats to get reserved
     * @return if reservation was successful
     */
    public boolean reserve(Customer customer, Seat... reserveSeats) {
        for (Seat seat : reserveSeats) {
            if (seats.get(seat).isReserved()) {
                return false;
            }
        }
        for (Seat seat : reserveSeats) {
            seats.get(seat).reserve(customer);
        }
        return true;
    }

    /**
     * Cancels a reservation.
     *
     * @param seat seat to unreserve
     */
    public void cancelReservation(Seat seat) {
        seats.get(seat).cancelReservation();
    }

    /**
     * Cancels a reservation.
     *
     * @param seat seat to unreserve
     */
    public void cancelReservation(ShowingSeat seat) {
        seat.cancelReservation();
    }

    /**
     * Cancels all reservations for a show
     */
    public void cancelAllReservations() {
        seats.keySet().forEach(a -> cancelReservation(a));
    }

    /**
     * Checks if a seat is reserved.
     *
     * @param seat seat to check
     * @return if the seat is reserved
     */
    public boolean isSeatReserved(Seat seat) {
        return seats.get(seat).isReserved();
    }

    /**
     * Getter for showingSeats in the showing.
     *
     * @return showingSeats in the showing
     */
    public Map<Seat, ShowingSeat> getSeats() {
        return seats;
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
     * Getter for theater.
     *
     * @return theater of the showing
     */

    public Theater getTheater() {
        return theater;
    }

    /**
     * Gets all the customers in the show.
     *
     * @return customers in the show
     */
    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        for (ShowingSeat showingSeat : seats.values()) {
            Customer customer = showingSeat.getReservee();
            if (!customers.contains(customer)) {
                customers.add(customer);
            }
        }
        return customers;
    }

    /**
     * Getter for movie.
     *
     * @return movie of the show
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Returns the movie's name.
     *
     * @return movie's name
     */
    @Override
    public String toString() {
        return movie.getName();
    }
}
