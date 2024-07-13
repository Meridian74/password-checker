package loc.exercise.pwdchecker.validators;

import loc.exercise.pwdchecker.config.PasswordConfig;
import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.exceptions.PasswordWithoutUpperCaseLetterException;

public class UpperCaseValidator extends AbstractValidator {

    private final int minimumUpperCaseLetter;

    public UpperCaseValidator(PasswordConfig config) {
        this.minimumUpperCaseLetter = config.getMinimumUpperCaseLetter();
    }

    @Override
    public int check(String text) throws InvalidPasswordException {
        super.check(text);

        int score = 0;
        for (char character : text.toCharArray()) {
            if (Character.isUpperCase(character)) {
                score++;
            }
        }

        if (score < minimumUpperCaseLetter) {
            throw new PasswordWithoutUpperCaseLetterException("Legalább " + minimumUpperCaseLetter
                    + " nagybetűnek kell lennie a jelszóban!");
        }

        return score;
    }

}