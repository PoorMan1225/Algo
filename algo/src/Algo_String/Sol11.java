package Algo_String;

import java.util.Scanner;

public class Sol11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            int count = 1;
            char c = s.charAt(i);
            sb.append(c);
            while (i != s.length()-1 && s.charAt(i+1) == c) {
                count++;
                i++;
            }
            if(count > 1) {
                sb.append(count);
            }
        }
        System.out.println(sb.toString());
    }
}
