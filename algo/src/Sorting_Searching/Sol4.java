package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        solution(arr, n);
    }

    public static void solution(int[] arr, int n) {
       Arrays.sort(arr);
       String answer = "U";
       for(int i=0; i<n-1; i++) {
           if(arr[i] == arr[i+1]) {
               answer = "D";
               break;
           }
       }
        System.out.println(answer);
    }
}
