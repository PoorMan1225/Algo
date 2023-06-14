package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        solution(arr, n);
    }

    public static void solution(int[] arr, int n) {
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        for(int i=0; i<n; i++) {
            if(temp[i] != arr[i]){
                System.out.print(i+1 +" ");
            }
        }
    }
}
