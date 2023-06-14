package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        solution(arr, n);
    }

    public static void solution(int[] arr, int n) {
        // 정렬에서 중요한 포인트는.
        // 앞에서 먼저 정렬이 되어있다는 것을 기억한다.
        for (int i = 1; i < n; i++) {
           int tmp = arr[i];
           int j=i;

           for(; j>0 && arr[j-1] > tmp; j--) {
               // 앞에서 먼저 정렬이 되어 있기 때문에 뒤에서 추가로 작업을 할 수 있다.
               // 뒤에서 부터 한칸 앞씩 땡긴다.
               arr[j] = arr[j-1];
           }
           arr[j] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
