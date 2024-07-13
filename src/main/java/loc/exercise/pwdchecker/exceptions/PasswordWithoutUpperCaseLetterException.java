package loc.exercise.pwdchecker.exceptions;

public class PasswordWithoutUpperCaseLetterException extends InvalidPasswordException {

    private static final long serialVersionUID = 1L;

    public PasswordWithoutUpperCaseLetterException() {
    }

    public PasswordWithoutUpperCaseLetterException(String message) {
        super(message);
    }

    public PasswordWithoutUpperCaseLetterException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordWithoutUpperCaseLetterException(Throwable cause) {
        super(cause);
    }

    public PasswordWithoutUpperCaseLetterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}