package textanalyzer;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(message);
    }
}