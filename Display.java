import java.awt.*;
import java.util.Map;

/**
 * The class controlling what gets displayed to the monitor.
 *
 * @author Ashlyn Balicki
 */

public class Display {
    public Display() {
    }

    /**
     * Puts text on the screen
     *
     * @param string text to put on the screen
     */
    public void displayText(String string) {
        System.out.println("Display: " + string);
    }

    /**
     * Put an image on the screen
     *
     * @param image image to put on the screen
     */
    public void displayImage(Image image) {
        System.out.println("Displaying image");
    }

    /**
     * Displays the available and unavailable showingSeats
     *
     * @param seats seats in a cinema for a show
     */
    public void displaySeats(Map<Seat, ShowingSeat> seats) {
        System.out.println("Updating show seats");
    }

    public void displayNotification(String notification) {

    }
}
