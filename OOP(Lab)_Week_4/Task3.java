
class Task3 {
    String name;
    int roll;
    String dpt;

    void s() {
        System.out.println("MUHAMMAD ASAD");
        System.out.println("Name: " + name);
        System.out.println("Roll_No: " + roll);
        System.out.println("Department: " + dpt);
        System.out.println("------------------------------");
    }

        public static void main(String[] args) {
            Task3 c = new Task3();
            Task3 d = new Task3();
            Task3 e = new Task3();
            c.name = "MUHAMMAD ASAD";
            c.roll = 93;
            c.dpt = "CE";
            d.name = "ALI";
            d.roll = 94;
            d.dpt = "CS";
            e.name = "AHMED";
            e.roll = 95;
            e.dpt = "IT";
            c.s();
            d.s();
            e.s();
        }
    }
