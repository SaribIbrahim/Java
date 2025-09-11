import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // zeroes at end
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.println("Array with 0's at end is: " + Arrays.toString(arr));

        //reverse array
        int left=0;
        int right=arr.length-1;
        int temp;
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("Array after reversal is: "+Arrays.toString(arr));

        //min number
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum number is: "+min);

        //max number
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number is: "+max);

        // second largest number
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest number is: "+secondLargest);

        // array sort ascending
        boolean isSorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array "+Arrays.toString(arr)+" is sorted in ascending order");
        }
        else{
            System.out.println("Array "+Arrays.toString(arr)+" is not sorted in ascending order");
        }

        //factorial
        System.out.println("Enter a number to find factorial: ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);

        sc.close();
    }
}