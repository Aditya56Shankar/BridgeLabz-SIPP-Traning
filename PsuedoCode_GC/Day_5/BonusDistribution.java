import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String department;
    private int rating;     // 1–5
    private double salary;

    public Employee(String name, String dept, int rating, double salary) {
        this.name = name;
        this.department = dept;
        this.rating = rating;
        this.salary = salary;
    }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getRating() { return rating; }
    public double getSalary() { return salary; }
}

public class BonusDistribution {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Emp-A", "IT", 5, 50000),
                new Employee("Emp-B", "IT", 3, 30000),
                new Employee("Emp-C", "IT", 2, 20000),
                new Employee("Emp-D", "Finance", 4, 40000),
                new Employee("Emp-E", "Finance", 1, 20000)
        );

        // Group employees by department
        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        // Process each department
        byDept.forEach((dept, empList) -> {
            double totalSalary = empList.stream().mapToDouble(Employee::getSalary).sum();
            double bonusPool = totalSalary * 0.10; // 10% of dept salaries

            int totalRating = empList.stream().mapToInt(Employee::getRating).sum();

            System.out.println("\nDepartment: " + dept + " | Bonus Pool = ₹" + bonusPool);

            empList.forEach(emp -> {
                double share = (emp.getRating() / (double) totalRating) * bonusPool;
                System.out.println(emp.getName() + " (Rating " + emp.getRating() + ") → ₹" + Math.round(share));
            });
        });
    }
}
