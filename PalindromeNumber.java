import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter to a number to check if it's palindrome");
        int num = sc.nextInt();
        
        int original = num;
        int rev = 0; // reverse number

        while (num != 0) {
            int digit=num%10; // get last digit from original number
            rev=rev*10+digit;  // build reverse number
            num=num/10; //remove the last digit from original number
        }

        if(original==rev){
            System.out.println("Number " + original + " is a palindrome");
        }
        else{
            System.out.println("Number " + original + " is not a palindrome");
        }
        sc.close();
    }
}
