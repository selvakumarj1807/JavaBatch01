import java.util.ArrayList;

public class Collection01 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        String removedFruit = fruits.remove(1);
        System.out.println("Removed fruit: " + removedFruit);
        System.out.println("Fruits after removal: " + fruits);

        System.out.println("Number of fruits: " + fruits.size());
    }

}