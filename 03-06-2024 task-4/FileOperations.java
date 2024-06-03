import java.io.*;

public class FileOperations {

    public static void main(String[] args) {
        String filePath = "example.txt"; // specify the file path

        //  Append text to a file
        String textToAppend = "This is the text to append.";
        appendToFile(filePath, textToAppend);

        //  Read content from the file
        System.out.println("Reading file content:");
        readFile(filePath);

        //  Get the size of the file
        getFileSize(filePath);

        //  Delete the file
        // deleteFile(filePath);
        

        //  Read file line by line (this will demonstrate no file error since we deleted it)
        System.out.println("Reading file content line by line:");
        readFileLineByLine(filePath);
    }


/*1. Write a java program to Append text or string in a file */

    //  Append text to a file
    public static void appendToFile(String filePath, String text) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(text + System.lineSeparator());
            System.out.println("Successfully appended text to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }



/*2. Write a java program to Read content from file using BufferedReader*/ 

    //  Read content from the file
    public static void readFile(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }


/*3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes */

    //  Get the size of the file
    public static void getFileSize(String filePath) {
        File file = new File(filePath);

        if (file.exists()) {
            long bytes = file.length();
            double kilobytes = (double) bytes / 1024;
            double megabytes = kilobytes / 1024;

            System.out.println("File size in bytes: " + bytes);
            System.out.println("File size in kilobytes: " + kilobytes);
            System.out.println("File size in megabytes: " + megabytes);
        } else {
            System.out.println("The specified file does not exist.");
        }
    }


/*4. Write a java program to Delete a file */

    //  Delete the file
    // public static void deleteFile(String filePath) {
    //     File file = new File(filePath);

    //     if (file.delete()) {
    //         System.out.println("File deleted successfully.");
    //     } else {
    //         System.out.println("Failed to delete the file.");
    //     }
    // }


/*5. Write a java program to Read a file line by line */

    //  Read file line by line
    public static void readFileLineByLine(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file line by line.");
            e.printStackTrace();
        }
    }
}



