import java.util.Scanner;

public class CombinedProblemString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String is: " + str);

        // palindrome check
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("String " + str + " is a palindrome");
        } else {
            System.out.println("String " + str + " is not a palindrome");
        }

        sc.close();
    }
}
