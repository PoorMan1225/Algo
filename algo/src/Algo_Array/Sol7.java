package Algo_Array;

import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] array = new int[c];
        for(int i=0; i<c; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(solution(array));;
    }

    public static int solution(int[] array) {
        int sum = 0;
        int pr = 0;
        for (int j : array) {
            if (j < 1) {
                pr = 0;
                continue;
            }
            sum += ++pr;
        }
        return sum;
    }
}


