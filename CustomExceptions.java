import java.util.InputMismatchException; // Importing the missing class
import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Age must be between 0 and 150.");
            }

            System.out.println("Your age is: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        } finally {
            scanner.close();
            System.out.println("Program terminated gracefully.");
        }
    }
}
