import java.io.*;
import java.util.Scanner;

// Custom exception for age validation
class InvalidAgeException extends Exception {
    private int age;

    public InvalidAgeException(int age) {
        super("Invalid age: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class eOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array access with exception handling
        handleArrayAccess(scanner);

        // File reading with exception handling
        readFileWithExceptionHandling(scanner);

        // Age validation with custom exception
        handleAgeValidation(scanner);

        scanner.close();
    }



/*6. Write a Java program that initializes an array of integers and prompts the user to enter an 
index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException.*/ 

    //Array access with exception handling
    public static void handleArrayAccess(Scanner scanner) {
        int[] numbers = {1, 2, 3, 4, 5}; // Initialize the array
        System.out.println("Enter an index to access:");
        int index = scanner.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter an index between 0 and " + (numbers.length - 1) + ".");
        }
    }


/*7. Write a Java program that reads a file specified by the user. Use exception handling to catch 
any FileNotFoundException and IOException. */

    // File reading with exception handling
    public static void readFileWithExceptionHandling(Scanner scanner) {
        System.out.println("Enter the file path to read:");
        String filePath = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }


/*8. Create a custom exception InvalidAgeException that includes the invalid age value as additional data. 
Write a program that takes age as input and throws this exception if the age is not within the valid range (0-120).*/

    // Part 3: Age validation with custom exception
    public static void handleAgeValidation(Scanner scanner) {
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            System.out.println("Invalid age value: " + e.getAge());
        }
    }

    // Validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException(age);
        }
    }
}



