import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

public class EmployeeRecordKeeper {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add employees
        employees.add(new Employee("Alice", "IT"));
        employees.add(new Employee("Bob", "HR"));
        employees.add(new Employee("Charlie", "IT"));
        employees.add(new Employee("Diana", "Finance"));

        // Filter employees from IT department using Streams
        List<Employee> itEmployees = employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.toList());

        System.out.println("Employees in IT Department:");
        itEmployees.forEach(System.out::println);
    }
}
