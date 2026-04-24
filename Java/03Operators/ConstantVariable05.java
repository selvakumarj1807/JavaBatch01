public class ConstantVariable05 {
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        System.out.println("MAX_VALUE: " + MAX_VALUE);

        //MAX_VALUE = 200; 
        // This line will cause a compile-time error because MAX_VALUE is a constant variable.

        int a = 50;

        int result = MAX_VALUE + a;

        System.out.println("MAX_VALUE: " + MAX_VALUE);
        System.out.println("Result: " + result);
    }
}
