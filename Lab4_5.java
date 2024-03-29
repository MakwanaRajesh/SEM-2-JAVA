import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = new String();
        System.out.println("Enter a Strig: ");
        a = in.next();
        int l = a.length();
        System.out.println("Length of the string " + a + " is " + l);
        System.out.println("Your sub String is:" + a.substring(l / 2));

    }

}
