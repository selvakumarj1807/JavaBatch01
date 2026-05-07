// Method With Parameters but Without Return Value
// No Return Type but with Parameters

class Employee{
    void displayEmployeeDetails(String name, int age){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        // Calling the method with parameters
        emp.displayEmployeeDetails("John Doe", 30);

        System.out.println("------------------------------");

        emp.displayEmployeeDetails("Jane Smith", 25);
    }

}