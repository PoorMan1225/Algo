package Algo_String;

import java.util.Scanner;

public class Sol10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        String sentence = split[0];
        String c = split[1];

        for(int i=0; i<sentence.length(); i++) {
            int lastIdx = sentence.lastIndexOf(c, i);
            int firstIdx = sentence.indexOf(c, i);

            if(lastIdx < 0 && firstIdx < 0) {
                System.out.print(0 + " ");
                continue;
            }
            if(lastIdx < 0) {
                System.out.print(Math.abs(firstIdx - i) + " ");
                continue;
            }
            if(firstIdx < 0) {
                System.out.print(Math.abs(lastIdx - i) + " ");
                continue;
            }
            System.out.print(Math.min(Math.abs(firstIdx - i), Math.abs(lastIdx - i)) + " ");
        }
    }
}
