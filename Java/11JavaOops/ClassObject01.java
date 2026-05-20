class Car {
    String color;
    String model;

    void drive() {
        System.out.println("The " + color + " " + model + " is driving.");
    }
}

public class ClassObject01 {
    public static void main(String[] args) {
        System.out.println("Creating a Car object 01...");
        Car myCar01 = new Car();

        myCar01.color = "red";
        myCar01.model = "Toyota";
        myCar01.drive();

        System.out.println("Creating a Car object 02...");
        Car myCar02 = new Car();
        myCar02.color = "blue";
        myCar02.model = "Honda";
        myCar02.drive();
    }
}