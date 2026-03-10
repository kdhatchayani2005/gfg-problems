import java.util.Scanner;

public class Concatenation {

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       
            ans[i + n] = nums[i]; 
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = getConcatenation(nums);
        System.out.println("Concatenated Array:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}