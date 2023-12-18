import java.awt.*;
import java.time.Duration;

/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie {
    private String name;
    private String description;
    private Image image;
    private Duration length;

    public Movie(String name, Image image, Duration length, String description) {
        this.name = name;
        this.image = image;
        this.length = length;
        this.description = description;
    }

    public Movie(String name, Image image, int length, String description) {
        this(name, image, Duration.ofMinutes(length), description);
    }

    public Movie(String name, Duration length, String description) {
        this(name, null, length, description);
    }

    public Movie(String name, int length, String description) {
        this(name, null, length, description);
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
     * Getter for movie description.
     *
     * @return the movie's description
     */
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
