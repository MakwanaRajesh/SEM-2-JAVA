import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        String line = "darshan University";
        int vowels = 0, consonat = 0;

        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonat++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonatts: " + consonat);

    }
}
