import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers to find minimum and maximum");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        sc.close();
    }
}
