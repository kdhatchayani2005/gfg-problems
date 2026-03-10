import java.util.Scanner;

public class Duplicates {

    public static boolean containsDuplicate(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {
                    return true;   
                }
            }
        }

        return false; 
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

        boolean result = containsDuplicate(nums);

        System.out.println(result);

        sc.close();
    }
}