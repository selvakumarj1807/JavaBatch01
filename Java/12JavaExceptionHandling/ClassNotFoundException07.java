class Student {
    // This class is intentionally left empty for demonstration purposes.
}

public class ClassNotFoundException07 {
    public static void main(String[] args) {
        try {
            Class.forName("Student");

            System.out.println("Class found successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
