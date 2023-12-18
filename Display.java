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
     * Puts text on the screen.
     *
     * @param text text to put on the screen
     */
    public void displayText(String text) {
        System.out.println("Display: " + text);
    }

    /**
     * Put an image on the screen.
     *
     * @param image image to put on the screen
     */
    public void displayImage(Image image) {
        System.out.println("Displaying image");
    }

    /**
     * Displays the available and unavailable showingSeats.
     *
     * @param seats seats in a cinema for a show
     */
    public void displaySeats(Map<Seat, ShowingSeat> seats) {
        System.out.println("Updating show seats");
    }

    /**
     * Displays a notification.
     *
     * @param notification notification to put on the screen
     */
    public void displayNotification(String notification) {
        System.out.println("Notification: " + notification);
    }
}
