/**
 * Room where showings of movies are held
 *
 * @author Ashlyn Balicki
 */

public class Theater {
    Seat[] seats;

    public Theater(Seat[] seats) {
        this.seats = seats;
    }

    /**
     * Getter for rows
     *
     * @return rows in theater
     */
    public Seat[] getSeats() {
        return seats;
    }
}
