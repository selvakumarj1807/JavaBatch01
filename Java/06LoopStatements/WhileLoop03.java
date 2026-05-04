public class WhileLoop03 {
    public static void main(String[] args) {
        
        boolean isRaining = true;
        int days = 0;

        while (isRaining) {
            System.out.println("It is raining. I will stay inside.");
            days++;

            if (days >= 5) {
                isRaining = false; // Stop the loop after 5 days
            }
        }
    }
}
