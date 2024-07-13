package loc.exercise;

import java.util.Scanner;

public class UserInputManager {
    private final Scanner scanner;

    // constructor
    public UserInputManager(Scanner scanner) {
        this.scanner = scanner;
    }


    public String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

}
