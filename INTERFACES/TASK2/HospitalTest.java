package INTERFACE.TASK2;

abstract class HospitalEmployee {
    String name;
    int id;
    String department;

    public HospitalEmployee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    abstract void performDuty();

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
    }
}

class Doctor extends HospitalEmployee {
    String specialty;

    public Doctor(String name, int id, String department, String specialty) {
        super(name, id, department);
        this.specialty = specialty;
    }

    void performDuty() {
        System.out.println(name + " is diagnosing patients in the " + department + " department, specializing in " + specialty + ".");
        consultPatient();
    }

    private void consultPatient() {
        System.out.println(name + " is consulting a patient regarding their health condition.");
    }
}

class Nurse extends HospitalEmployee {
    String shift;

    public Nurse(String name, int id, String department, String shift) {
        super(name, id, department);
        this.shift = shift;
    }

    void performDuty() {
        System.out.println(name + " is assisting with patient care in the " + department + " department during the " + shift + " shift.");
        monitorPatient();
    }

    private void monitorPatient() {
        System.out.println(name + " is monitoring the vital signs of patients.");
    }
}

class Janitor extends HospitalEmployee {
    String workArea;

    public Janitor(String name, int id, String department, String workArea) {
        super(name, id, department);
        this.workArea = workArea;
    }

    void performDuty() {
        System.out.println(name + " is maintaining cleanliness in the " + workArea + " area.");
        cleanFloor();
    }

    private void cleanFloor() {
        System.out.println(name + " is cleaning the floor in the " + workArea + " area.");
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        HospitalEmployee doctor = new Doctor("Dr. Smith", 101, "Emergency Room", "Trauma");
        HospitalEmployee nurse = new Nurse("Nurse Jane", 102, "Surgery", "Night");
        HospitalEmployee janitor = new Janitor("Mike", 103, "General Ward", "Hallway");

        doctor.displayEmployeeDetails();
        doctor.performDuty();
        System.out.println("----------------------------");

        nurse.displayEmployeeDetails();
        nurse.performDuty();
        System.out.println("----------------------------");

        janitor.displayEmployeeDetails();
        janitor.performDuty();
    }
}
