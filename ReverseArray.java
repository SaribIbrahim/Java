import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Array reversal code");

        System.out.println("Enter number of entries you want in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter entries for array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: "+Arrays.toString(arr));
        System.out.println("");

        int left = 0;
        int right = arr.length - 1;
        int temp;

        while (left < right) {
            temp = arr[left]; // temp=arr[0];
            arr[left] = arr[right]; // arr[0]=arr[4];
            arr[right] = temp; // arr[4]=temp;
            left++;
            right--;
        }
        System.out.print("Reversed Array is: "+Arrays.toString(arr));
        sc.close();
    }
}
