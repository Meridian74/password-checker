package loc.exercise.pwdchecker.validators;

import loc.exercise.pwdchecker.config.PasswordConfig;
import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.exceptions.PasswordWithoutLowerCaseLetterException;

public class LowerCaseValidator extends AbstractValidator {

    private final int minimumLowerCaseLetters;

    public LowerCaseValidator(PasswordConfig config) {
        this.minimumLowerCaseLetters = config.getMinimumLowerCaseLetter();
    }

    @Override
    public int check(String text) throws InvalidPasswordException {
        super.check(text);

        int score = 0;
        for (char character : text.toCharArray()) {
            if (Character.isLowerCase(character)) {
                score++;
            }
        }

        if (score < minimumLowerCaseLetters) {
            throw new PasswordWithoutLowerCaseLetterException("Minimum " + minimumLowerCaseLetters
                    + " kisbetűnek kell lennie a jelszóban!");
        }

        return score;
    }

}