package Algo_String;

import java.util.Locale;
import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sLower = s.toLowerCase(Locale.ROOT);
        System.out.println(palindrome(sLower) ? "YES" : "NO");
    }

    public static boolean palindrome(String s) {
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
