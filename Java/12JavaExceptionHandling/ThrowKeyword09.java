public class ThrowKeyword09 {
    public static void main(String[] args) {
        try {
            int withdrawalAmount = 1000;
            int accountBalance = 500;

            if (withdrawalAmount > accountBalance) {
                throw new IllegalArgumentException("Insufficient funds for withdrawal.");
            } else {
                accountBalance -= withdrawalAmount;
                System.out.println("Withdrawal successful. Remaining balance: " + accountBalance);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
