package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(arr, n);
    }

    public static void solution(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            boolean flag = true;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag) break;
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
