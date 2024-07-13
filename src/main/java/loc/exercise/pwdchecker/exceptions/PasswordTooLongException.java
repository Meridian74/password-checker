package loc.exercise.pwdchecker.exceptions;

public class PasswordTooLongException extends InvalidPasswordException {

    private static final long serialVersionUID = 1L;

    public PasswordTooLongException() {
    }

    public PasswordTooLongException(String message) {
        super(message);
    }

    public PasswordTooLongException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordTooLongException(Throwable cause) {
        super(cause);
    }

    public PasswordTooLongException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}