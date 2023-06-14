package Algo_String;

import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String[] sentences = new String[count];
        for(int i=0; i<count; i++) {
            String sentence = sc.next();
            sentences[i] = sentence;
        }

        for(String s : sentences) {
            char[] charArr = new char[s.length()];
            for(int i=s.length()-1; i>=0; i--) {
                charArr[s.length()-1-i] = s.charAt(i);
            }
            System.out.println(new String(charArr));
        }
    }
}
