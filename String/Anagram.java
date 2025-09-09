import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String str1=sc.nextLine().toLowerCase();

        System.out.println("Enter String 2: ");
        String str2=sc.nextLine().toLowerCase();

        if(str1.length()!= str2.length()){
            System.out.println("Strings are not anagrams");
            sc.close();
            return;
        }

        StringBuilder sb=new StringBuilder(str2);//Convert str2 to mutable form
        boolean isAnagram=true;

        for(int i=0;i<str1.length();i++){ //Check each char of str1
            char ch=str1.charAt(i);
            int index=sb.indexOf(String.valueOf(ch)); // checks ch of str1 in str2 and returns index if found
            if(index!=-1){ //-1 means ch is not found
                sb.deleteCharAt(index); // remove matched character
            }
            else{
                isAnagram=false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }

        sc.close();
    }
}
