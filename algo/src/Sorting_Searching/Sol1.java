package Sorting_Searching;

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(arr, n);
    }

    public static void solution(int[] arr, int n) {
        for(int i=0; i<n-1; i++) {
            // 가장 작은 값을 찾는다.
            int m = i;
            for(int j=i+1; j<n; j++) {
                if(arr[m] > arr[j]) {
                    m = j;
                }
            }
            // 가장 작은 값과 위치를 바꾼다.
            int tmp = arr[i];
            arr[i] = arr[m];
            arr[m] = tmp;
        }
        for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
    }
}
