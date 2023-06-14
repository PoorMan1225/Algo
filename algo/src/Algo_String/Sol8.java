package Algo_String;

import java.util.Locale;
import java.util.Scanner;

public class Sol8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sLower = s.toLowerCase(Locale.ROOT);
        System.out.println(palindrome(sLower) ? "YES" : "NO");
    }

    public static boolean palindrome(String s) {
        int fp = 0;
        int lp = s.length()-1;
        while (fp <= lp) {
            while (!alphabet(s.charAt(fp))) {
                fp++;
            }
            while (!alphabet(s.charAt(lp))) {
                lp--;
            }
            if(s.charAt(fp++) != s.charAt(lp--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean alphabet(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
}
