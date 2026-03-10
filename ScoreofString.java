import java.util.*;
public class ScoreofString {
    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String val = sc.next();

        System.out.println(scoreOfString(val));
    }
}
