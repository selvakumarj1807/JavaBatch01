public class StringBuffer02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb.toString()); // Output: Hello World

        sb.insert(5, ",");
        System.out.println(sb.toString()); // Output: Hello, World

        sb.replace(6, 11, "Java");
        System.out.println(sb.toString()); // Output: Hello, Java

        sb.delete(5, 6);
        System.out.println(sb); // Output: Hello Java

        sb.reverse();
        System.out.println(sb); // Output: avaJ olleH
    }
}
