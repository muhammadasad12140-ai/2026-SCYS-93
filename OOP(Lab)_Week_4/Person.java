import java.util.Random;
import java.util.Scanner;

class Person {
    String name;
    int x = 0;
    int y = 0;

    Person(String name) {
        this.name = name;
    }

    void move(int dx, int dy, int[][] hurdles) {
        int newX = x + dx;
        int newY = y + dy;

        for (int i = 0; i < hurdles.length; i++) {
            if (hurdles[i][0] == newX && hurdles[i][1] == newY) {
                System.out.println(name + " encounters hurdle at (" + newX + ":" + newY + ")");
                showLocation();
                return;
            }
        }

        x = newX;
        y = newY;
        showLocation();
    }
    void showLocation() {
        System.out.println(name + " is at = (" + x + " : " + y + ")");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int[][] hurdles = { {1, 2}, {-1, 1}, {0, -3} };

        Person ali = new Person("Ali");
        Person asad = new Person("Asad");

        System.out.println("Starting:");
        ali.showLocation();
        asad.showLocation();
        System.out.println("Hasan has Random Movement, Ali follows order");
        System.out.println("(^ = up, v = down, < = left, > = right, q = quit)");

        while (true) {
            System.out.print("\nAli: Where should i go now: ");
            char choice = input.next().charAt(0);

            if (choice == 'q') {
                System.out.println("Simulation ended.");
                break;
            }

            if (choice == '^') {
                ali.move(0, 1, hurdles);
            } else if (choice == 'v') {
                ali.move(0, -1, hurdles);
            } else if (choice == '<') {
                ali.move(-1, 0, hurdles);
            } else if (choice == '>') {
                ali.move(1, 0, hurdles);
            } else {
                System.out.println("Wrong input, Ali stays here.");
            }

            int r = random.nextInt(4);   // 0 se 3 tak
            if (r == 0) {
                asad.move(0, 1, hurdles);
            } else if (r == 1) {
                asad.move(0, -1, hurdles);
            } else if (r == 2) {
                asad.move(-1, 0, hurdles);
            } else {
                asad.move(1, 0, hurdles);
            }
        }
    }
}

