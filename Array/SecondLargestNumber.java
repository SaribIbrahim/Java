import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter an array of 5 numbers to find second largest number:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                // add arr[i] < max to avoid duplicates (e.g., [10, 10, 5])
                secondMax = arr[i];
            }
        }

        sc.close();

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all numbers may be same).");
        } else {
            System.out.println("Second largest number is " + secondMax);
        }
    }
}
