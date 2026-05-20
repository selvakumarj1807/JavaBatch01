
class Mobile {

    Mobile() {
        System.out.println("No-arg constructor");
    }

    Mobile(String brand) {
        System.out.println("Parameterized constructor: " + brand);
    }

    Mobile(String brand, String model) {
        System.out.println("Parameterized constructor: " + brand + " " + model);
    }
}

public class ConstructorOverloading05 {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile("Apple");
        Mobile mobile3 = new Mobile("Samsung", "Galaxy S21");
    }
}
