import java.util.Scanner;

public class MaxConsequtive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // array size
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}