package loc.exercise.pwdchecker.exceptions;

public class PasswordWithoutNumberException extends  InvalidPasswordException {

    private static final long serialVersionUID = 1L;

    public PasswordWithoutNumberException() {
    }

    public PasswordWithoutNumberException(String message) {
        super(message);
    }

    public PasswordWithoutNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordWithoutNumberException(Throwable cause) {
        super(cause);
    }

    public PasswordWithoutNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}