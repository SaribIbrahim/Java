import java.util.Arrays;
public class CombinedProblem {
    public static void main(String[] args){
        int[] arr={3, 0, 5, 0, 2, 2, 5};
        System.out.println("Array is: "+Arrays.toString(arr));
        //zereos at end
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

        //reversing the array
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
        System.out.println("Array after reversal is: " + Arrays.toString(arr));

        //min number
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum number is: " + min);

        //max number
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number is: " + max);

        //second largest
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
        System.out.println("Second largest number is: " + secondLargest);
       
        //factorial
        int fact=1;
        int n=5;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + n + " is " + fact);

    }
}
