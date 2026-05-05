import java.util.HashMap;

public class HashMapLoop06 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Alice");
        students.put(2, "Bob");

        System.out.println("Students: " + students);

        // Loop through the HashMap using entrySet
        System.out.println("Looping through HashMap:");

        for (HashMap.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
