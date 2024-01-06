import java.util.*;

public class Lab225 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of farenheit:");

        float f = sc.nextFloat();
        System.out.print(f);

        System.out.print("Degree of farenheit : ");
        System.out.print((f - 32) * 5 / 9.0);

    }
}