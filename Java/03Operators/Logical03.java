public class Logical03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical AND (&&) // Any One Condition False Then Result is False
        System.out.println("Logical AND (&&):");
        System.out.println("(10 > 5) && (20 < 30): " + ((a > 5) && (b < 30))); // true && true -> true
        System.out.println("(10 > 15) && (20 < 30): " + ((a > 15) && (b < 30))); // false && true -> false

        // Logical OR (||) // Any One Condition True Then Result is True
        System.out.println("\nLogical OR (||):");
        System.out.println("(10 > 5) || (20 < 30): " + ((a > 5) || (b < 30))); // true || true -> true
        System.out.println("(10 > 15) || (20 < 30): " + ((a > 15) || (b < 30))); // false || true -> true

        // Logical NOT (!) // Reverse The Result
        System.out.println("\nLogical NOT (!):");
        System.out.println("!(10 > 5): " + (!(a > 5))); // !(true) -> false
        System.out.println("!(10 > 15): " + (!(a > 15))); // !(false) -> true
    }
}
