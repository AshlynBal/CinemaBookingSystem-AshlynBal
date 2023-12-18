import java.util.ArrayList;
import java.util.Arrays;

/**
 * A building holding theaters
 *
 * @author Ashlyn Balicki
 */
public class Cinema {
    String name;
    ArrayList<Movie> movies;
    ArrayList<Show> shows;
    ArrayList<Theater> theaters;

    public Cinema(String name, ArrayList<Movie> movies) {
        this.name = name;
        this.movies = movies;
        theaters = new ArrayList<>();
    }

    public Cinema(String name, Movie... movies) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.movies.addAll(Arrays.asList(movies));
        theaters = new ArrayList<>();
    }


    /**
     * Adds a movie to the cinema's list of movies.
     *
     * @param movie movie to add
     */
    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Added " + movie);
    }

    /**
     * Showing of a movie to get displayed at the cinema
     *
     * @param show    what show
     * @param theater what theater
     */
    public void addShow(Show show, Theater theater) {
        shows.add(show);
        System.out.println("Added " + show);
    }

    /**
     * Adds theater to the cinema's list of theaters.
     *
     * @param theater theater to get added to cinema
     */
    public void addTheater(Theater theater) {
        theaters.add(theater);
    }

    /**
     * Cancels a show and notifies all the viewers.
     *
     * @param show show to cancel
     */
    public void cancelShow(Show show) {
        ShowingSeat[] showingSeats = show.getSeats();
        ArrayList<Customer> customers = show.getCustomers();
        for (ShowingSeat showingSeat : showingSeats) {
            showingSeat.cancelReservation();
        }
        customers.forEach(customer -> {
            System.out.print("Calling: " + customer.getName() + ": ");
            customer.call("Your show has been cancelled.");
        });
    }

    /**
     * Getter for shows
     *
     * @return shows at the cinema
     */
    public ArrayList<Show> getShows() {
        return shows;
    }

    /**
     * Getter for movies
     *
     * @return movies at the cinema
     */
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    /**
     * Getter for theaters in the cinema
     *
     * @return theaters at the cinema
     */
    public ArrayList<Theater> getTheaters() {
        return theaters;
    }
}
