class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class HierarchicalInheritance08 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat(); // Inherited from Animal
        dog.bark(); // Defined in Dog

        cat.eat(); // Inherited from Animal
        cat.meow(); // Defined in Cat
    }
}
