package loc.exercise.pwdchecker.exceptions;

public class PasswordWithoutSymbolException extends  InvalidPasswordException {

    private static final long serialVersionUID = 1L;

    public PasswordWithoutSymbolException() {
    }

    public PasswordWithoutSymbolException(String message) {
        super(message);
    }

    public PasswordWithoutSymbolException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordWithoutSymbolException(Throwable cause) {
        super(cause);
    }

    public PasswordWithoutSymbolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}