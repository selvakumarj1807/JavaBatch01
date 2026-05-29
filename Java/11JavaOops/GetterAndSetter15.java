class Employee {
    // Private Variables
    private int empId;
    private String empName;
    private double empSalary;

    // Getter for empId
    public int getEmpId() {
        return empId;
    }

    // Setter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for empName
    public String getEmpName() {
        return empName;
    }

    // Setter for empName
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter for empSalary
    public double getEmpSalary() {
        return empSalary;
    }

    // Setter for empSalary
    public void setEmpSalary(double empSalary) {
        if (empSalary > 0) {
            this.empSalary = empSalary;
        } else {
            System.out.println("Invalid salary. Please enter a positive value.");
        }
    }
}

public class GetterAndSetter15 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting employee details using setters
        emp.setEmpId(101);
        emp.setEmpName("John Doe");
        emp.setEmpSalary(50000.0);

        // Getting employee details using getters
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Salary: " + emp.getEmpSalary());
    }
    
}
