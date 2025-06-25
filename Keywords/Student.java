class StudentDetails {
    static String universityName = "State University";
    static int totalStudents = 0;

    String name;
    String grade;
    final int rollNumber;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class Student {
    public static void main(String[] args) {
	StudentDetails s1 = new StudentDetails("Aditya", 1, "A");
        StudentDetails s2 = new StudentDetails("Riya", 2, "B");
	s1.displayDetails();
	s2.displayDetails();
	Student.displayTotalStudents();


	}
}