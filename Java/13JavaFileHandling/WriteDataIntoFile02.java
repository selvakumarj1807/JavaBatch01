import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile02 {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("newfile.txt");

            writer.write("Hello, World!");
            writer.write("\nWelcome to Java programming.");
            
            writer.close();
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
