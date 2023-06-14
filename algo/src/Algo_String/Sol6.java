package Algo_String;

import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(!sb.toString().contains(String.valueOf(s.charAt(i)))) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
