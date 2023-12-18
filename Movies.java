import java.util.ArrayList;

public class Movies {
    private static ArrayList<Movie> movies;
    public static Movie SHREK;
    public static Movie SHREK2;
    public static Movie SHREK3;
    public static Movie SHREK4;
    public static Movie PUSSINBOOTS;
    public static Movie PUSSINBOOTS2;

    public Movies() {
        SHREK = new Movie("Shrek", null, 90);
        SHREK2 = new Movie("Shrek 2", null, 93);
        SHREK3 = new Movie("Shrek the Third", null, 93);
        SHREK4 = new Movie("Shrek Forever After", null, 95);
        PUSSINBOOTS = new Movie("Puss in Boots", null, 90);
        PUSSINBOOTS2 = new Movie("Puss in Boots: The Last Wish", null, 102);
    }

    public static ArrayList<Movie> getAllMovies() {
        return movies;
    }

    public static Movie getMovie(String name) {
        Movie target = null;
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                target = movie;
                break;
            }
        }
        return target;
    }
}