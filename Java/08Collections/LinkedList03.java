import java.util.LinkedList;

public class LinkedList03 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
