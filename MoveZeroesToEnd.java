import java.util.Arrays;
import java.util.Scanner;
public class MoveZeroesToEnd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 numbers for array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
            }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println("Array with 0's at end is: "+Arrays.toString(arr));
        sc.close();
        }
       
    }

