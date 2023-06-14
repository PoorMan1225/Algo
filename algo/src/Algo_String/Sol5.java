package Algo_String;

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int lp = s.length()-1;
        int fp = 0;

        char[] charArr = s.toCharArray();
        while (fp < lp) {
            while (!checkAlphaBet(s, fp)) {
                fp++;
            }
            while (!checkAlphaBet(s, lp)) {
                lp--;
            }
            char temp = charArr[fp];
            charArr[fp++] = charArr[lp];
            charArr[lp--] = temp;
        }
        System.out.println(new String(charArr));
    }

    public static boolean checkAlphaBet(String s, int idx) {
        return (s.charAt(idx) >= 'A' && s.charAt(idx) <= 'Z' || s.charAt(idx) >= 'a' && s.charAt(idx) <= 'z');
    }
}
