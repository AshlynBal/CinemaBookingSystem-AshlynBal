/**
 * Room where showings of movies are held
 *
 * @author Ashlyn Balicki
 */

public class Theater {
    private Seat[] seats;
    private String name;

    public Theater(Seat[] seats, String name) {
        this.seats = seats;
        this.name = name;
    }

    /**
     * Getter for rows
     *
     * @return rows in theater
     */
    public Seat[] getSeats() {
        return seats;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
