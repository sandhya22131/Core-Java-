import java.util.*;
public class Example
{
public static void main(String[] args)
{
Scanner sc=new 
import java.util.Scanner;
public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Check if age is valid
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older to proceed.");
            } else {
                System.out.println("Access granted. You are old enough.");
            }
        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}


// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
