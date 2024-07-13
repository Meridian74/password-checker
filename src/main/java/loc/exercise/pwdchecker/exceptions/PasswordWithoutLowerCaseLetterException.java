package loc.exercise.pwdchecker.exceptions;

public class PasswordWithoutLowerCaseLetterException extends InvalidPasswordException {

    private static final long serialVersionUID = 1L;

    public PasswordWithoutLowerCaseLetterException() {
    }

    public PasswordWithoutLowerCaseLetterException(String message) {
        super(message);
    }

    public PasswordWithoutLowerCaseLetterException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordWithoutLowerCaseLetterException(Throwable cause) {
        super(cause);
    }

    public PasswordWithoutLowerCaseLetterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}