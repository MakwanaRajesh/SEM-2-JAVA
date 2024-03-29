import java.util.Scanner;

public class Lab5_3 {

    public static void main(String[] args) {
        int c = 0, v = 0;
        String s;
        Scanner In = new Scanner(System.in);
        System.out.println("Enter String :");
        s = In.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                v++;
            } else if (ch == ' ') {

            } else if (Character.isDigit(s.charAt(i))) {

            }

            else
                c++;
        }
        System.out.println("Vowels are " + v + " and consonants are " + c);
    }
}