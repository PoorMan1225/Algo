package Algo_TwoPointer_SlidingWindow;

import java.util.Scanner;

public class Sol6 {
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
        int max = 0;
        int length = 0;
        int startIndex = 0;
        int endIndex = 0;

        // staart 와 end가 길이를 계산하는 것으로 된다면 수월하게 풀 수 있다.
        // 아래코드는 틀림;
        for (endIndex = 0; endIndex < n; endIndex++) {
            length += arr[endIndex];
            if (arr[endIndex] == 0) {
                if (k > 0) {
                    length += 1;
                    k--;
                    continue;
                }
                if (max < length) {
                    max = length;
                }
                while (arr[startIndex] > 0) {
                    length -= arr[startIndex];
                    startIndex++;
                }
            }
        }
        System.out.println(max);
    }
}
