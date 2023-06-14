package Algo_Array;

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] array = new int[c+1];
        for(int i=1; i<c+1; i++) {
            array[i] = sc.nextInt();
        }
        for(int i=1; i<array.length; i++) {
            if(array[i-1] < array[i]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
