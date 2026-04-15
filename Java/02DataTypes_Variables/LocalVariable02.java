class student01 {
    void display(){
        int a = 10; // Local variable
        System.out.println("The value of a is: " + a);
    }
}


public class LocalVariable02 {
    public static void main(String[] args) {
        student01 obj = new student01();
        obj.display();
    }
}
