import java.util.Scanner;

class Solution {
    public static int appendCharacters(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return t.length() - j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int result = appendCharacters(s, t);
        System.out.println(result);
    }
}