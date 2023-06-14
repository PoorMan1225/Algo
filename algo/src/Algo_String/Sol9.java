package Algo_String;

import java.util.Scanner;

public class Sol9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = s.replaceAll("[^0-9]", "");
        int result = Integer.parseInt(t);
        System.out.println(result);
    }
}
