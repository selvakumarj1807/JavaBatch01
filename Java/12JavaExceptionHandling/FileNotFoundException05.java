import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundException05 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            
            FileInputStream fis = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
