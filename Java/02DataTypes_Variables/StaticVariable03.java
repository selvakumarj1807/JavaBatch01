class student03 {
    static int a = 10; // Static variable

    void display(){
        System.out.println("The value of a is: " + a);
    }
}


public class StaticVariable03 {
     public static void main(String[] args) {
        student03 obj01 = new student03();
        obj01.display();

        //-----------------------------

        student03 obj02 = new student03();

        student03.a = 20;

        obj02.display();
    }
}
