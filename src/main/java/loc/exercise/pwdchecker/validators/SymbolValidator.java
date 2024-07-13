package loc.exercise.pwdchecker.validators;

import loc.exercise.pwdchecker.config.PasswordConfig;
import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.exceptions.PasswordWithoutSymbolException;

public class SymbolValidator extends AbstractValidator {

    private static final char[] ACCEPTED_CHAR_SYMBOLS = "'\"-+*\\/=()~^<>#&@{}[].:;,_!?%$€§÷×".toCharArray();
    private final int minimumSymbol;

    public SymbolValidator(PasswordConfig config) {
        this.minimumSymbol = config.getMinimumSymbol();
    }

    @Override
    public int check(String text) throws InvalidPasswordException {
        super.check(text);

        int counter = 0;
        for (char character : text.toCharArray()) {
            if (isSymbol(character)) {
                counter++;
            }
        }

        if (counter < minimumSymbol) {
            throw new PasswordWithoutSymbolException("Legalább " + minimumSymbol
                    + " szimbólumnak kell lennie a jelszóban!");
        }

        return counter;
    }

    private boolean isSymbol(char character) {
        for (char symbol : ACCEPTED_CHAR_SYMBOLS) {
            if (symbol == character) {
                return true;
            }
        }
        return false;
    }

}