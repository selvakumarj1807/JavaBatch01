//  Method Without Parameters & Without Return Value
// No Return Type WithOut Arguments

class Company{
    void display(){
        System.out.println("Welcome to ABC Company");
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.display();

        System.out.println("---------------------------------");

        c.display();
    }
}