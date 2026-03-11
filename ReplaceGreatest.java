import java.util.Scanner;

public class ReplaceGreatest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;         
            maxRight = Math.max(maxRight, current);
        }

        System.out.println("Output array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}