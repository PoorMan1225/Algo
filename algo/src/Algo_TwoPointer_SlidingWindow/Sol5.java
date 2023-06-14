package Algo_TwoPointer_SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        int[] array = new int[n/2+1];
        Arrays.setAll(array, operand -> operand+1);
        int sum = 0;
        int count = 0;
        int startIndex = 0;
        int endIndex = 0;

        for(endIndex=0; endIndex<array.length; endIndex++) {
            sum += array[endIndex];
            if(sum == n) count++;
            while (sum > n) {
                sum -= array[startIndex++];
                if(sum == n) count++;
            }
        }
        System.out.println(count);
    }
}
