package loc.exercise;

import loc.exercise.pwdchecker.PasswordStrengthCalculator;
import loc.exercise.pwdchecker.config.PasswordConfig;
import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;
import loc.exercise.pwdchecker.validators.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            new Main().run(scanner);
        }
    }

    // program teszteléséhez egy konzolos beviteli felület
    private void run(Scanner scanner) {
        UserInputManager userInputManager = new UserInputManager(scanner);
        String password = userInputManager.readString("Kérem, adjon meg egy jelszót: ");

        PasswordConfig passwordConfig = new PasswordConfig.Builder()
                .withMinimumLength(4)
                .withMaximumLength(32)
                .withMinimumLowerCaseLetter(1)
                .withMinimumUpperCaseLetter(1)
                .withMinimumNumber(1)
                .withMinimumSymbol(1)
                .build();

        PasswordValidator[] validators = {
          new MinAndMaxLengthValidator(passwordConfig),
          new LowerCaseValidator(passwordConfig),
          new UpperCaseValidator(passwordConfig),
          new NumberValidator(passwordConfig),
          new SymbolValidator(passwordConfig)
        };

        PasswordStrengthCalculator calculator = new PasswordStrengthCalculator();

        try {
            int passwordStrength = calculator.calculate(validators, password);
            System.out.println("A jelszó erőssége: " + passwordStrength);
        } catch (InvalidPasswordException  e) {
            System.out.println("Hiba történt a jelszó ellenőrzésekor. " + e.getMessage());
        }

    }

}