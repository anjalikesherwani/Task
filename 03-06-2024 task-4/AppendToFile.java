/*1. Write a java program to Append text or string in a file */

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {
        String filePath = "example.txt"; // specify the file path
        String textToAppend = "This is the text to append.";

        appendToFile(filePath, textToAppend);
    }

    public static void appendToFile(String filePath, String text) {
        FileWriter fileWriter = null;
        try {
            // Create FileWriter in append mode
            fileWriter = new FileWriter(filePath, true);
            // Append the text
            fileWriter.write(text + System.lineSeparator());
            System.out.println("Successfully appended text to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file writer.");
                e.printStackTrace();
            }
        }
    }
}






/*2. Write a java program to Read content from file using BufferedReader */

/*3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes */

/*4. Write a java program to Delete a file */

/*5. Write a java program to Read a file line by line */

/*6. Write a Java program that initializes an array of integers and prompts the user to enter an index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException.*/ 

/*7. Write a Java program that reads a file specified by the user. Use exception handling to catch any FileNotFoundException and IOException. */

/*8. Create a custom exception InvalidAgeException that includes the invalid age value as additional data. Write a program that takes age as input and throws this exception if the age is not within the valid range (0-120).*/