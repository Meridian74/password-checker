package loc.exercise.pwdchecker.exceptions;

public class PasswordTooShortException extends InvalidPasswordException {

    private static final long serialVersionUID = 1L;

    public PasswordTooShortException() {
    }

    public PasswordTooShortException(String message) {
        super(message);
    }

    public PasswordTooShortException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordTooShortException(Throwable cause) {
        super(cause);
    }

    public PasswordTooShortException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}