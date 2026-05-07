// Static Method(No need to create object)

class Bank{
    static double getInterest(double amount){
        return amount * 0.05;
    }

    static void display(){
        System.out.println("Welcome to the Bank");
    }

    public static void main(String[] args) {
        Bank.display();
        double interest = Bank.getInterest(10000);
        System.out.println("Interest: " + interest);
    }
}