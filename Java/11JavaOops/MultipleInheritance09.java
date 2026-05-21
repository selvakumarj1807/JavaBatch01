interface Animal {
    void eat();
}

interface Dog {
    void bark();
}

class Labrador implements Animal, Dog {
    @Override
    public void eat() {
        System.out.println("Labrador is eating.");
    }

    @Override
    public void bark() {
        System.out.println("Labrador is barking.");
    }
}

class puppy implements Animal, Dog {
    @Override
    public void eat() {
        System.out.println("Puppy is eating.");
    }

    @Override
    public void bark() {
        System.out.println("Puppy is barking.");
    }
}

public class MultipleInheritance09 {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();
        labrador.bark();

        puppy puppy = new puppy();
        puppy.eat();
        puppy.bark();
    }
}
