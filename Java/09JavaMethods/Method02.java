// Method Without Parameters but With Return Value
// Return Type but With Out Arguments

class Employee{
    int getSalary(){
        return 50000;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        int salary = emp.getSalary();

        System.out.println("Employee Salary Using Variable: " + salary);

        // Directly Calling the Method
        System.out.println("Employee Salary Directly: " + emp.getSalary());
    }

}