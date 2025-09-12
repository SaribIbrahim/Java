import java.util.Scanner;

public class CombinedProblemString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
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

        // consonants and vowels
        int consonants=0;
        int vowels=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels in string "+str+" are: "+vowels);
        System.out.println("Consonants in string "+str+" are: "+consonants);

        //remove duplicates
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(result.indexOf(String.valueOf(ch))==-1){
                result.append(ch);
            }
        }
        System.out.println("String after removing duplicates: "+result);

        sc.close();
    }
}
