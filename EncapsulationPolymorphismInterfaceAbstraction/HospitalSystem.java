abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomCharge;
    private String records = "";

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double roomCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.roomCharge = roomCharge;
    }

    public double calculateBill() {
        return daysAdmitted * roomCharge;
    }

    public void addRecord(String record) {
        records += record + "\n";
    }

    public String viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String records = "";

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records += record + "\n";
    }

    public String viewRecords() {
        return records;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        
        InPatient inPatient = new InPatient("P001", "John Doe", 45, "Pneumonia", 5, 2000);
        System.out.println(inPatient.getPatientDetails());
        System.out.println();
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, "Allergy", 500);
        System.out.println(outPatient.getPatientDetails());
        
    }
}
