class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ParameterizedConstructor03 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        student1.display();
        student2.display();
    }
}
