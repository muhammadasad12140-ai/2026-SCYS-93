class Friends {
    private String name;

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void t() {
        System.out.println("Name: "+name);

    }
}
class Task4 {
    Long CNIC;

    void s() {
        System.out.println("Hello world");
        System.out.println("Phone Number: " +CNIC);
    }

    static void main(String[] args) {
        Task4 c = new Task4();
        Friends d = new Friends();
        Friends e = new Friends();
        Friends f= new Friends();
        c.CNIC=3650151783755L;
        c.s();
        d.setName("ASAD");
        e.setName("ALI");
        f.setName("AHMED");

        d.t();
        e.t();
        f.t();
    }
}
