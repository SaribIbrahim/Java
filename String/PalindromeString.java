import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's palindrome: ");
        String str=sc.nextLine();

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("String " + str + " is a palindrome");
        }

        else{
            System.out.println("String " + str + " is not a palindrome");
        }

        sc.close();

    }
}
