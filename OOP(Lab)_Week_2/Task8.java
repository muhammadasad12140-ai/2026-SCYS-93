import java.util.Scanner;

public class Task8
{
    static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        System.out.println("Enter your roll number");
        int roll=l.nextInt();
        System.out.println(roll);
        System.out.println("enter your total marks");
        double marks=l.nextInt();
        System.out.println(marks);
        System.out.println("enter your obtained marks");
        double obtained=l.nextInt();
        System.out.println(obtained);
        double percentage=(obtained*100)/marks;
        System.out.println("percentage is "+percentage);
    }
}
