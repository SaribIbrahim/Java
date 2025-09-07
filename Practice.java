import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of elements you want in each array: ");
        int n=sc.nextInt();
        // check array sorted
        int[] n1 = new int[n];
        int[] n2 = new int[n];
        int[] n3 = new int[n];

        System.out.println("Enter 5 numbers for array 1: ");
        for (int i = 0; i < n1.length; i++) {
            n1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 numbers for array 2: ");
        for (int i = 0; i < n2.length; i++) {
            n2[i] = sc.nextInt();
        }

        System.out.println("Enter 5 numbers for array 3: ");
        for (int i = 0; i < n3.length; i++) {
            n3[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Is "+Arrays.toString(n1)+" sorted? ");
        System.out.println(sort(n1));
        System.out.println("Is "+Arrays.toString(n2)+" sorted? ");
        System.out.println(sort(n2));
        System.out.println("Is "+Arrays.toString(n3)+" sorted? ");
        System.out.println(sort(n3));
    }

    static boolean sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
