import java.util.Scanner;

public class Lab3T3
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in minutes:");
        int time = sc.nextInt();
        int m = time / 60;
        int n = time % 60;

        if (time < 720) {
            System.out.println(m + ":" + n + " AM");
        } else
            System.out.println(m + ":" + n + " PM");
    }
    }


