
public class EmployeeManagementSystem {


    public static void main(String[] args) {
        IEmployee fullTime = new FullTimeEmployee(101, "Alice", 50000);
        fullTime.assignDepartment("Finance");
        fullTime.displayDetails();
        fullTime.calculateSalary(10); // Hours not used for full-time

        // Part-time employee
        IEmployee partTime = new PartTimeEmployee(102, "Bob", 10000);
        partTime.assignDepartment("Support");
        partTime.displayDetails();
        partTime.calculateSalary(40);
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}


    abstract class IEmployee implements Department{
        int employeeId;
        String name;
        int baseSalary;
        String departmentName;

        public IEmployee(int employeeId, String name, int baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }


        abstract int calculateSalary(int hour);
        public void displayDetails(){
            System.out.println("employee id: "+employeeId+"name: "+name+"base salary: "+baseSalary);
        }
        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(int baseSalary) {
            this.baseSalary = baseSalary;
        }

        @Override
        public void assignDepartment(String departmentName) {
            this.departmentName = departmentName;
        }

        @Override
        public String getDepartmentDetails() {
            return "Department: " + departmentName;
        }

    }

    class FullTimeEmployee extends IEmployee  {


        public FullTimeEmployee(int employeeId, String name, int baseSalary) {
            super(employeeId, name, baseSalary);
        }

        @Override
        public int calculateSalary(int hour) {
            System.out.println("total income: "+hour*1000);
            return hour*1000;
        }

        public void assignDepartment(String departmentName) {
            this.departmentName=departmentName;
            System.out.println("dipartment: "+departmentName);
        }
        public String getDepartmentDetails() {
            return null;
        }
    }
class PartTimeEmployee extends IEmployee {
    public PartTimeEmployee(int employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public int calculateSalary(int hour) {
        System.out.println("total wage: "+hour*1000);
        return hour*1000;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName=departmentName;
        System.out.println("dipartment: "+departmentName);
    }

    @Override
    public String getDepartmentDetails() {
        return null;
    }
}

