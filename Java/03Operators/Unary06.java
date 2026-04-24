public class Unary06 {
    public static void main(String[] args) {
        int a = 5;

        // Unary plus operator
        int result1 = +a; // result1 will be 5

        System.out.println("Result of unary plus: " + result1);

        // Unary minus operator
        int result2 = -a; // result2 will be -5

        System.out.println("Result of unary minus: " + result2);

        // Increment operator
        // Pre-increment

        System.out.println("Pre-increment: " + ++a); // a becomes 6, then printed

        // Post-increment
        System.out.println("Post-increment: " + a++); // a is printed as 6, then becomes 7
        System.out.println("Current value of a: " + a); // a is now 7

        // Decrement operator
        // Pre-decrement
        System.out.println("Pre-decrement: " + --a); // a becomes 6

        // Post-decrement
        System.out.println("Post-decrement: " + a--); // a is printed as 6, then becomes 5
        System.out.println("Current value of a: " + a); // a is now 5

        // ! 

        boolean isTrue = true;
        boolean isFalse = !isTrue; // isFalse will be false

        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);
    }
}
