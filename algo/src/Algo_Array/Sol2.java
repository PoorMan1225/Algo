package Algo_Array;

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] array = new int[c];
        for(int i=0; i<c; i++) {
            array[i] = sc.nextInt();
        }
        int minValue = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(minValue < array[i]) {
                count++;
                minValue = array[i];
            }
        }
        System.out.println(count);
    }
}
