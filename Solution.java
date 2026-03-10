import java.util.ArrayList;
import java.util.*;

class Solution {

    // Function to find subarray with given sum
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Shrink window if sum exceeds target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            // If target found
            if (sum == target) {
                result.add(start + 1); // 1-based index
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    // Main method (Program execution starts here)
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;

        ArrayList<Integer> ans = subarraySum(arr, target);

        System.out.println(ans);
    }
}