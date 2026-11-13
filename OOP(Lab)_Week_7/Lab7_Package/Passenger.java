package Lab7_Package;

public class Passenger {
    Passport p;
    void show(){
        System.out.println("Name: " + p.name);
        System.out.println("Passport No: " + p.passport_no);
        System.out.println("Age: " + p.age);
    }

    static void main(String[] args) {
        Passport a = new Passport();
        Passenger b = new Passenger();
        b.p = a;
        b.show();
    }
}
