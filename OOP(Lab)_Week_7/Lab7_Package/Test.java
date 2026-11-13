package Lab7_Package;

public class Test {
    static void main(String[] args) {
        Student a = new Student();
        Teacher b = new Teacher();
        Course c = new Course("OOP");
        Student_C d = new Student_C("Lab_7", c);
        d.display();
//        b.s = a;
//        b.ab();


    }
}
