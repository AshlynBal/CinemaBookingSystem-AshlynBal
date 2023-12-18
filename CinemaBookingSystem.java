import java.util.ArrayList;
import java.util.Date;

/**
 * A system used to process user input commands.
 *
 * @author Ashlyn Balicki
 */
public class CinemaBookingSystem {
    private Display display;
    private Cinema cinema;

    /**
     * Initializes the cinema booking system
     */
    public CinemaBookingSystem(Cinema cinema) {
        this.display = new Display();
        this.cinema = cinema;
    }

    /**
     * Initializes the cinema booking system
     */
    public CinemaBookingSystem() {
        this.display = new Display();
        this.cinema = new Cinema(Movies.getAllMovies());
    }

    /**
     * Finds showing of a movie at the given date in the given cinema.
     *
     * @param movie movie
     * @param date  day of the show
     * @return Showing of a movie at the given time and cinema
     */
    public Show findShow(Movie movie, Date date) {
        return null;
    }

    /**
     * Finds all showings of a movie at a cinema
     *
     * @param movie movie
     * @return all shows
     */
    public ArrayList<Show> findShows(Movie movie) {
        return cinema.getShows(movie);
    }

    /**
     * Retrieves & displays show's name and time.
     *
     * @param show the show to display.
     */
    public void getShowDetails(Show show) {
        display.displayText(show.getMovie().getName());
        display.displayText(show.getTime().toString());
        display.displayText(show.getMovie().getLength().toString());
    }

    /**
     * Display all the seats in the show.
     *
     * @param show the show whose seats you're displaying
     */
    public void displaySeats(Show show) {
        display.displaySeats(show.getSeats());
    }

    /**
     * Accepts one or more seat reservations from customer.
     *
     * @param seats the seats to reserve
     * @return if the reservation was successful. If any seats are taken, return false.
     */
    public boolean reserveSeats(Customer customer, Show show, Seat... seats) {
        return show.reserve(customer, seats);
    }

    /**
     * Cancels one or more reservations.
     *
     * @param show  show to cancel reservations for
     * @param seats seats to remove reservations for
     */
    public void cancelReservations(Show show, Seat... seats) {
        for (Seat seat : seats) {
            show.cancelReservation(seat);
        }
    }

    /**
     * Cancels all of a users reservations for a show.
     *
     * @param show     show to cancel reservations for
     * @param customer customer to remove reservations for
     */
    public void cancelUserReservations(Show show, Customer customer) {
        int counter = 0;
        for (ShowingSeat seat : customer.getReservations()) {
            if (seat.getShow().equals(show)) {
                show.cancelReservation(seat);
                counter++;
            }
        }
        System.out.println("Cancelled " + counter + " reservations.");
    }

    /**
     * Cancels a show and sends a message to everyone who reserved it
     *
     * @param show the show to cancel
     */
    public void cancelShow(Show show) {
        cinema.cancelShow(show);
    }
}
