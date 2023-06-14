package Algo_TwoPointer_SlidingWindow;

import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr, n, k);
    }

    private static void solution(int[] arr, int n, int k) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                sum += arr[i];
                max += arr[i];
                continue;
            }

            sum += arr[i];
            sum -= arr[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
