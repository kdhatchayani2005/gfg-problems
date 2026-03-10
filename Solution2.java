  import java.util.*;

class Solution2 {

    int missingNum(int[] arr) {

        long n = arr.length + 1;
        long expectedSum = n * (n + 1) / 2;

        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return (int)(expectedSum - actualSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Solution2 obj = new Solution2();

        int result = obj.missingNum(arr);

        System.out.println("Missing number: " + result);

        sc.close();
    }
}