import java.awt.*;
import java.time.Duration;

/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie {
    String name;
    Image image;
    Duration length;

    public Movie(String name, Image image, Duration length) {
        this.name = name;
        this.image = image;
        this.length = length;
    }

    public Movie(String name, Image image, int length) {
        this(name, image, Duration.ofMinutes(length));
    }

    public Movie(String name, Duration length) {
        this(name, null, length);
    }

    public Movie(String name, int length) {
        this(name, null, length);
    }

    /**
     * Getter for name of the movie.
     *
     * @return name of the movie
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the movie's image.
     *
     * @return movie's image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Getter for the length of the movie.
     *
     * @return length of the movie
     */
    public Duration getLength() {
        return length;
    }

    /**
     * Returns details about the movie.
     *
     * @return details about the movie.
     */
    public String getDetails() {
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
