package tn.esprit.zooManagement.Exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("the Animal's age is negative");
    }
}
