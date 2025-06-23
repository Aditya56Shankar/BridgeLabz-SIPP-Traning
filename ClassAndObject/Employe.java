import java.util.Scanner;

class EmployeDetails {
    String name;
    private int id;
    int salary;

    public EmployeDetails(String name,int id,int salary) {
        this.name = name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("id: "+id);
        System.out.println("salary: "+salary);
    }
}
public class Employe{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int id=sc.nextInt();
        int salary=sc.nextInt();
        EmployeDetails emp=new EmployeDetails(name,id,salary);
	emp.display();
    }
}
