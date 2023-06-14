package Algo_String;

import java.util.Locale;
import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase(Locale.ROOT);
        String c1 = sc.nextLine().toLowerCase(Locale.ROOT);
        int count = 0;
        for(char c : sentence.toCharArray()) {
            if(c1.charAt(0) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
