package Lab7_Package;

public class Student_C {
    String name;
    Course s;

    public Student_C(String name, Course s) {
        this.name = name;
        this.s = s;

    }

        void display(){
            System.out.println("Name: " + name);
            System.out.println("studies: " + s.name);
        }


}
