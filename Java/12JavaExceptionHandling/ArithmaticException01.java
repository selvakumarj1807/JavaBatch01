public class ArithmaticException01 {
    public static void main(String[] args) {
        try {
            int loanAmount = 500000;
            int tenure = 0;

            int emi = loanAmount / tenure;

            System.out.println("EMI: " + emi);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tenure cannot be zero.");
            System.out.println("Exception Message: " + e.getMessage());
            System.out.println(e);
        }
    }
}