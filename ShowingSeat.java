
/**
 * A seat in a show.
 *
 * @author Ashlyn Balicki
 */
public class ShowingSeat {
    Seat seat;
    Show show;
    boolean reserved;
    Customer reservee;


    public ShowingSeat(Seat seat, Show show) {
        this.seat = seat;
        this.show = show;
    }

    /**
     * Attempts to reserve a seat, and returns if it was successful
     *
     * @return if the reservation was successful
     */
    public boolean reserve(Customer reservee) {
        if (reserved) return false;
        reserved = true;
        this.reservee = reservee;
        show.reserve(this);
        return true;
    }

    /**
     * Cancels a seat reservation
     *
     * @return if the seat reservation was successfully canceled
     */
    public boolean cancelReservation() {
        if (!reserved) return false;
        reserved = false;
        this.reservee = null;
        show.cancelReservation(this);
        return true;
    }

    /**
     * Checks if this is reserved.
     *
     * @return if this is reserved
     */
    public boolean isReserved() {
        return reserved;
    }

    /**
     * Getter for show
     *
     * @return the seat's show
     */
    public Show getShow() {
        return show;
    }

    /**
     * Getter for reservee.
     *
     * @return reservee
     */
    public Customer getReservee() {
        return reservee;
    }

    public Seat getSeat() {
        return seat;
    }
}
