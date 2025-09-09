import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check character frequency: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[26];// array to store frequency of a-z

        for (int i = 0; i < str.length(); i++) { // only alphabets
            char ch = str.charAt(i);// ch = 'c'
            freq[ch - 'a']++; // increments freq[2] by 1, 'a' here means ascii value

        }

        // display frequency
        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + " = " + freq[i]);
            }
        }

        sc.close();
    }
}
