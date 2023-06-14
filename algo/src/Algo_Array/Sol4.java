package Algo_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] arry = new int[c];
        arry[0] = 1;
        arry[1] = 1;
        for(int i=2; i<c; i++) {
            arry[i] = arry[i-1] + arry[i-2];
        }
       for (int i : arry) {
           System.out.print(i + " ");
       }
    }
}
