class BankAccount {
    private double balance = 0.0;

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value less than or equal to the balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation14 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println("Initial balance: " + account.getBalance());

        account.deposite(1000.0);

        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(500.0);
        
        System.out.println("Final balance: " + account.getBalance());
    }
}
