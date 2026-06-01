public class NumberFormatException04 {
    public static void main(String[] args) {
        
        try {
            String amount = "10K";

            int value = Integer.parseInt(amount);

            System.out.println("Parsed value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
