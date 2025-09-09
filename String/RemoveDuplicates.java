import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a string to remove duplicates characters: ");
        String str=sc.nextLine().toLowerCase();
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
