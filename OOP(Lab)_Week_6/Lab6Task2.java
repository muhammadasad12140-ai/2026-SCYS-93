import java.util.Random;
import java.util.Scanner;

class Hurdles {
    private int[][] spots = {{1, 2}, {2, 2}, {-1, 1}};

    public boolean isHurdle(int x, int y) {
        for (int[] s : spots) {
            if (s[0] == x && s[1] == y) {
                return true;
            }
        }
        return false;
    }
}

class DirectedWalker {
    private int x = 0, y = 0;
    private Hurdles hurdles;

    public DirectedWalker(Hurdles hurdles) {
        this.hurdles = hurdles;
    }

    public void move(char dir) {
        int newX = x, newY = y;
        if (dir == '^') newY++;
        else if (dir == 'v') newY--;
        else if (dir == '<') newX--;
        else if (dir == '>') newX++;

        if (hurdles.isHurdle(newX, newY)) {
            System.out.println("Ali encounters hurdle at (" + newX + ":" + newY + ")");
        } else {
            x = newX;
            y = newY;
        }
        System.out.println("Ali is at = (" + x + " : " + y + ")");
    }

    public String getLocation() {
        return "(" + x + " : " + y + ")";
    }
}

class RandomWalker {
    private int x = 0, y = 0;
    private Hurdles hurdles;
    private Random random = new Random();

    public RandomWalker(Hurdles hurdles) {
        this.hurdles = hurdles;
    }

    public void move() {
        int newX = x, newY = y;
        int choice = random.nextInt(4);
        if (choice == 0) newY++;
        else if (choice == 1) newY--;
        else if (choice == 2) newX--;
        else newX++;

        if (hurdles.isHurdle(newX, newY)) {
            System.out.println("Hasan encounters hurdle at (" + newX + ":" + newY + ")");
        } else {
            x = newX;
            y = newY;
        }
        System.out.println("Hasan is at = (" + x + " : " + y + ")");
    }

    public String getLocation() {
        return "(" + x + " : " + y + ")";
    }
}

public class Lab6Task2 {
    public static void main(String[] args) {
        Hurdles hurdles = new Hurdles();
        DirectedWalker ali = new DirectedWalker(hurdles);
        RandomWalker hasan = new RandomWalker(hurdles);
        Scanner sc = new Scanner(System.in);

        System.out.println("Starting: Ali's Location is = " + ali.getLocation()
                + " Hasan's Location is = " + hasan.getLocation());
        System.out.println("Hasan has Random Movement, Ali follows order");

        while (true) {
            System.out.print("Ali: Where should i go now (q to quit): ");
            char dir = sc.next().charAt(0);
            if (dir == 'q') {
                break;
            }
            ali.move(dir);
            hasan.move();
        }
    }
}