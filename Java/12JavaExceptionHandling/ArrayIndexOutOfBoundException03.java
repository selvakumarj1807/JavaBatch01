public class ArrayIndexOutOfBoundException03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // An array of size 5

        try {
            System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
