
public class FinallyBlock08 {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Result: " + a);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
