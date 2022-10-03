package phoneinfoproject;

public class OutOfBoundException extends Exception{

    public OutOfBoundException() {
        super();
    }

    public OutOfBoundException(String message) {
        super(message);
    }

    public OutOfBoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfBoundException(Throwable cause) {
        super(cause);
    }

    protected OutOfBoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
