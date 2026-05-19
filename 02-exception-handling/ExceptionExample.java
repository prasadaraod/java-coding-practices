import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionExample {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older to register.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        // 1. Try-Catch with Custom Exception
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
        }

        // 2. Try-With-Resources (AutoCloseable)
        // Note: The file might not exist, which is fine, it will just hit the catch block.
        try (BufferedReader br = new BufferedReader(new FileReader("dummy.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
