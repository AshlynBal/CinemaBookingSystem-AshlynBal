/**
 * Room where showings of movies are held
 *
 * @author Ashlyn Balicki
 */

public class Theater {
    Row[] rows;

    public Theater(Row[] rows) {
        this.rows = rows;
    }

    /**
     * Getter for rows
     *
     * @return rows in theater
     */
    public Row[] getRows() {
        return rows;
    }
}
