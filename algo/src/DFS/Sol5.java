package DFS;

import java.util.Scanner;

public class Sol5 {
    public static int[] arr;
    public static int MIN_COUNT = Integer.MAX_VALUE;
    public static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 동전 종류의 개수
        arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i] = sc.nextInt();
        }
        M = sc.nextInt();
        for(int i=0; i<n; i++) {
            DFS(arr[i], 1);
        }
        System.out.println(MIN_COUNT);
    }

    public static void DFS(int value, int count) {
        if(value == M) {
            if(MIN_COUNT > count) MIN_COUNT = count;
            return;
        }
        int add = 0;
        for(int i=0; i<arr.length; i++) {
            if((value + arr[i]) > M)
                continue;
            if(add < arr[i]) {
                add = arr[i];
            }
        }
        DFS(value+add, count+1);
    }
}
