import java.util.Scanner;

public class ConsonantsAndVowels {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count consonants and vowels: ");
        String str = sc.nextLine().toLowerCase();

        int consonants = 0;
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}
