import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(str2);

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            sc.close();
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = sb.indexOf(String.valueOf(ch));
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                System.out.println("Strings are not anagrams");
                sc.close();
                return;
            }
        }
        
        if (sb.length() == 0) {
            System.out.println("Strings are anagrams");
        }
    }
}
