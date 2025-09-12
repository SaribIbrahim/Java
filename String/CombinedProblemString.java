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

        // character frequency
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
        }
        System.out.println("Character frequencies:");
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                char letter=(char)(i+'a');
                System.out.println(letter+" = "+freq[i]);
            }
        }


        sc.close();
    }
}
