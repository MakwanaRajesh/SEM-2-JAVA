import java.util.Scanner;

public class lab3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in 1st subject::");

        double a = sc.nextDouble();
        System.out.println("Enter marks obtained in 2st subject: ");

        double b = sc.nextDouble();
        System.out.println("Enter marks obtained in 3st subject: ");

        double c = sc.nextDouble();
        System.out.println("Enter marks obtained in 4st subject: ");

        double d = sc.nextDouble();
        System.out.println("Enter marks obtained in 5st subject: ");

        double e = sc.nextDouble();

        double pt;

        pt = (((a + b + c + d + e) * 100) / 500);
        System.out.println(pt);
        if (pt >= 60) {
            System.out.println("The Student has Obatained A-Division");
        } else if (pt >= 50 && pt <= 59) {
            System.out.println("The Student has Obatained B-Division");
        } else if (pt >= 40 && pt <= 49)

        {
            System.out.println("The Student has Obatained C-Division");
        } else {
            System.out.println("Fail");
        }

    }
}