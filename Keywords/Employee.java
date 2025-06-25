public class Employee {
    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("Aditya Shankar", 101, "Software Engineer");
        EmployeeDetails emp2 = new EmployeeDetails("Riya Sharma", 102, "Project Manager");
        emp1.displayDetails();
        EmployeeDetails.displayTotalEmployees();
    }
}

class EmployeeDetails {
    static String companyName = "BridgeLabz";
    static int totalEmployees = 0;

    String name;
    String designation;
    final int id;

    public EmployeeDetails(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }
}
