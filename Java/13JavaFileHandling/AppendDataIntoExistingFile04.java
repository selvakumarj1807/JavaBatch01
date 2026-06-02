import java.io.FileWriter;
import java.io.IOException;

public class AppendDataIntoExistingFile04 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("newfile.txt", true); // 'true' for append mode
            
            fileWriter.write(" This is the new data to be appended.\n");

            fileWriter.close();

            System.out.println("Data has been appended to the existing file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
