package loc.exercise.pwdchecker;

import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.validators.PasswordValidator;

public class PasswordStrengthCalculator {

    public int calculate(PasswordValidator[] validators, String password) throws InvalidPasswordException {
        int strength = 0;
        for (PasswordValidator validator: validators) {
            int result = 0;
            result = validator.check(password);

            if (result < 0) {
                strength -= 6;
            }
            else {
                strength += 3;
            }
        }

        return strength + password.length();
    }

}