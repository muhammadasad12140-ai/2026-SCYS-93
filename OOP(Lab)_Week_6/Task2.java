class Patient{
    String name="ASAD";
}
class Doctor{
    void checkPatient(Patient p){
        System.out.println("Dr. ALI is checking " + p.name);
    }
}
public class task_1 {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Doctor d1 = new Doctor();
        d1.checkPatient(p1);
    }
}
