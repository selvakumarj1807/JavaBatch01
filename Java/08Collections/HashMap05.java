
import java.util.HashMap;

public class HashMap05 {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Alice");
        students.put(2, "Bob");

        System.out.println("Students: " + students);

        // Check if a key exists       
        if (students.containsKey(1)) {
            System.out.println("Key 1 exists.");
            System.out.println("Value for key 1: " + students.get(1));
        } else {
            System.out.println("Key 1 does not exist.");
        }
    }
}
