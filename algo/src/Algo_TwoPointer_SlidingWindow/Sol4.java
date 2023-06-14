package Algo_TwoPointer_SlidingWindow;

import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution2(arr, n, k);
    }

//    // 2중 포를 외부 루프 break 로 풀었음,.
//    private static void solution(int[] arr, int n, int k) {
//        int count = 0;
//        outer:for (int i = 0; i < n; i++) {
//           int sum = 0;
//           for(int j=i; j<n; j++) {
//               sum += arr[j];
//               if(sum > k) {
//                   break;
//               }else if(sum == k) {
//                   count++;
//                   break;
//               }
//               if(j == n-1) {
//                   break outer;
//               }
//           }
//        }
//        System.out.println(count);
//    }

    // 투포인터로 풀어보겠음.
    private static void solution2(int[] arr, int n, int k) {
        int sum = 0;
        int count = 0;
        int startIndex=0;
        int endIndex = 0;

        // 마지막 케이스 합은 체크를 못함.
         while (endIndex < n) {
             if(sum < k) {
                 sum += arr[endIndex++];
             }else if(sum == k){
                 count++;
                 sum += arr[endIndex++];
             }else {
                 sum -= arr[startIndex++];
             }
         }
        if(sum == k) count++;
        System.out.println(count);
    }
}
