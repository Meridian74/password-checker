package loc.exercise.pwdchecker.validators;

import loc.exercise.pwdchecker.config.PasswordConfig;
import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.exceptions.MissingPasswordException;

public abstract class AbstractValidator implements PasswordValidator {

    @Override
    public int check(String text) throws InvalidPasswordException {
        if (text == null) {
            throw new MissingPasswordException("Nem lett megadva jelszó!");
        }
        return 0;
    }

}