import java.util.HashSet;

public class HashSet04 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("HashSet: " + numbers);
        
    }
}
