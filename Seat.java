/**
 * A seat in a theater
 *
 * @author Ashlyn Balicki
 */

public class Seat {
    private String location;

    public Seat(String location) {
        this.location = location;
    }

    /**
     * Getter for seat location in theater
     *
     * @return seat's location in theater
     */
    public String getLocation() {
        return location;
    }
}
