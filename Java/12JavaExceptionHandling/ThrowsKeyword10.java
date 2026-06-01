import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword10 {
    static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(fileName);
        // Code to read the file

        System.out.println("File read successfully.");
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
