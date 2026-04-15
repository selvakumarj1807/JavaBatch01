class student02 {
    int a = 10; // Instance variable

    void display(){
        System.out.println("The value of a is: " + a);
    }
}


public class InstanceVariable03 {
    public static void main(String[] args) {
        student02 obj = new student02();
        obj.display();
    }
}
