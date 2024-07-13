package loc.exercise.pwdchecker.validators;

import loc.exercise.pwdchecker.config.PasswordConfig;
import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.exceptions.PasswordWithoutNumberException;

public class NumberValidator extends AbstractValidator {

    private final int minimumNumber;

    public NumberValidator(PasswordConfig config) {
        this.minimumNumber = config.getMinimumNumber();
    }

    @Override
    public int check(String text) throws InvalidPasswordException {
        super.check(text);

        int score = 0;
        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                score++;
            }
        }
        if (score < minimumNumber) {
            throw new PasswordWithoutNumberException("Minimum " + minimumNumber
                    + " számnak kell lennie a jelszóban!");
        }

        return score;
    }

}