package loc.exercise.pwdchecker.validators;

import loc.exercise.pwdchecker.exceptions.InvalidPasswordException;

public interface PasswordValidator {

    int check(String text) throws InvalidPasswordException;

}