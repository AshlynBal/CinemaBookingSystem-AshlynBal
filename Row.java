/**
 * Write a description of class Row here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Row {
    Seat[] seats;

    public Row(Seat[] seats) {
        this.seats = seats;
    }

    /**
     * Getter for showingSeats.
     *
     * @return showingSeats in row
     */
    public Seat[] getSeats() {
        return seats;
    }
}
