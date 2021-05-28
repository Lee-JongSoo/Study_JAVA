package ch16_4;

public class ShapeException extends Exception {
    /**
     * Constructs a ShapeException.
     */
    public ShapeException() {
        super();
    }
    /**
     * Constructs a ShapeException with a description.
     */
    public ShapeException( String s ) {
        super( s );
    }
}
