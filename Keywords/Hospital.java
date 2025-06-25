class Patient {
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}


public class Hospital {
    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul", 32, "Fever", 2001);
        Patient p2 = new Patient("Ananya", 45, "Diabetes", 2002);
	p1.displayDetails();
	Patient.getTotalPatients();


	}
}