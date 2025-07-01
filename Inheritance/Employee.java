public class EmployeeImp {
     String name;
     int id;
     double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}


class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String schoolName;

    public Intern(String name, int id, double salary, String schoolName) {
        super(name, id, salary);
        this.schoolName = schoolName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("School Name: " + schoolName);
    }
}


public class Employee {
    public static void main(String[] args) {
        EmployeeImp manager = new Manager("Alice", 101, 90000, 5);
        EmployeeImp developer = new Developer("Bob", 102, 80000, "Java");
        EmployeeImp intern = new Intern("Charlie", 103, 20000, "Tech University");

        System.out.println("--- Manager Details ---");
        manager.displayDetails();

        System.out.println("\n--- Developer Details ---");
        developer.displayDetails();

        System.out.println("\n--- Intern Details ---");
        intern.displayDetails();
    }
}
