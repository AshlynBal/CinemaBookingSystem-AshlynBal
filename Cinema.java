import java.util.ArrayList;
import java.util.Arrays;

/**
 * A building holding theaters
 *
 * @author Ashlyn Balicki
 */
public class Cinema {
    private ArrayList<Movie> movies;
    private ArrayList<Show> shows;
    private ArrayList<Theater> theaters;

    public Cinema(ArrayList<Movie> movies) {
        this.movies = movies;
        theaters = new ArrayList<>();
    }

    public Cinema(Movie... movies) {
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
        System.out.println("Added " + theater);
    }

    /**
     * Cancels a show and notifies all the viewers.
     *
     * @param show show to cancel
     */
    public void cancelShow(Show show) {
        ArrayList<Customer> customers = show.getCustomers();
        show.cancelAllReservations();
        customers.forEach(customer -> {
            customer.notify("Your show has been cancelled.");
        });
        shows.remove(show);
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
     * Getter for showings of a movie
     *
     * @param movie movie being checked for
     * @return showings of a movie
     */
    public ArrayList<Show> getShows(Movie movie) {
        ArrayList<Show> output = new ArrayList<>();
        for (Show show : shows) {
            if (show.getMovie() == movie) {
                output.add(show);
            }
        }
        return output;
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
