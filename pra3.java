import java.util.Scanner;

public class pra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        char lower = Character.toLowerCase(ch);
        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
        sc.close();
    }
}
