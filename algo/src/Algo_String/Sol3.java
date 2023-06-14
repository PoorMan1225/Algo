package Algo_String;

import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] split = sentence.split(" ");

        String maxSen = "";
        for(String s : split) {
            if(maxSen.length() < s.length())
                maxSen = s;
        }
        System.out.println(maxSen);
    }
}
