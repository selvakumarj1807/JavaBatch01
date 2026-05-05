
import java.util.ArrayList;

public class Collection02 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);

        System.out.println("----------------------------------");

        fruits.set(1, "Blueberry");
        System.out.println("Fruits after update: " + fruits);

        System.out.println("----------------------------------");

        String fruit = "Banana";

        if (fruits.contains(fruit)) {
            System.out.println(fruit + " is in the list.");
        } else {
            System.out.println(fruit + " is not in the list.");
        }

    }

}
