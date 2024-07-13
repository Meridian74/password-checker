package loc.exercise.pwdchecker.validators;

import loc.exercise.pwdchecker.config.PasswordConfig;
import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.exceptions.PasswordTooLongException;
import loc.exercise.pwdchecker.exceptions.PasswordTooShortException;

public class MinAndMaxLengthValidator extends AbstractValidator {

    private final int minimumLength;
    private final int maximumLength;


    public MinAndMaxLengthValidator(PasswordConfig config) {
        this.minimumLength = config.getMinimumLength();
        this.maximumLength = config.getMaximumLength();
    }


    @Override
    public int check(String text) throws InvalidPasswordException {
        super.check(text);

        if (text.length() < minimumLength) {
            throw new PasswordTooShortException("A jelszó túl rövid, minimum " +
                    minimumLength + " karaterből kell állnia!");
        }

        if (text.length() > maximumLength) {
            throw new PasswordTooLongException("A jelszó túl hosszú [méret: " + text.length() + "], maximum " +
                    minimumLength + " karaterből állhat!");

        }

        // score
        return text.length() - minimumLength + text.length();
    }

}