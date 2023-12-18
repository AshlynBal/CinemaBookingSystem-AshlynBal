import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Write a description of class CinemaBookingSystem here.
 *
 * @author Ashlyn Balicki
 */
public class CinemaBookingSystem {
    Display display;
    ArrayList<Cinema> cinemas;

    /**
     * Initializes the cinema booking system
     */
    public CinemaBookingSystem(ArrayList<Cinema> cinemas) {
        this.display = new Display();
        this.cinemas = cinemas;
    }

    public CinemaBookingSystem() {
        this(new ArrayList<>());
    }

    /**
     * Finds showing of a movie at the given date in the given cinema.
     *
     * @param movie  movie
     * @param cinema cinema
     * @param date   day of the show
     * @return Showing of a movie at the given time and cinema
     */
    public Show findShow(Movie movie, Cinema cinema, Date date) {
        return null;
    }

    /**
     * Finds all showings of a movie at a cinema
     *
     * @param movie  movie
     * @param cinema name of the cinema
     * @return all shows
     */
    public ArrayList<Show> findShows(Movie movie, Cinema cinema) {
        return null;
    }

    /**
     * Retrieves & displays show's name and time.
     *
     * @param show the show to display.
     */
    public void getShowDetails(Show show) {
        display.displayText(show.getDetails());
    }

    /**
     * Display all the showingSeats in the show.
     *
     * @param show the show whose showingSeats you're displaying
     */
    public void getSeats(Show show) {
        display.displaySeats(show.getSeats());
    }

    /**
     * Accept showingSeat reservations from customer.
     *
     * @param showingSeat the showingSeat to reserve
     * @return if the reservation was successful. If showingSeat is already taken, then return false.
     */
    public boolean reserveSeat(ShowingSeat showingSeat, Customer customer) {
        boolean success = showingSeat.reserve(customer);
        display.displaySeats(showingSeat.getShow().getSeats());
        return false;
    }

    /**
     * Cancels a show and sends a message to everyone who reserved it
     *
     * @param cinema the cinema with the canceled show
     * @param show   the show to cancel
     */
    public void cancelShow(Cinema cinema, Show show) {
        cinema.cancelShow(show);
    }

    public void addCinema(Cinema cinema) {
        cinemas.add(cinema);
    }

    public void initCinemas() {
        Cinema[] cinemas = new Cinema[]{
                new Cinema("Reading Cinemas", Movies.SHREK, Movies.SHREK2, Movies.PUSSINBOOTS, Movies.PUSSINBOOTS2),
                new Cinema("Hillsborough Cinemas", Movies.SHREK2, Movies.SHREK3, Movies.SHREK4, Movies.PUSSINBOOTS2),
                new Cinema("AMC Bridgewater", Movies.SHREK4, Movies.PUSSINBOOTS, Movies.PUSSINBOOTS2)
        };
        this.cinemas.addAll(Arrays.asList(cinemas));
    }
}
