package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 바둑이 승차 (DFS)
 */
public class Sol3 {
    public static int[] arr;
    public static int maxWeight = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        DFS(1, n, 0, c);
        System.out.println(maxWeight);
    }

    // 어차피 모든 경우의 수를 다루기 때문에
    // 제한을 넘기는 것은 맨위에서 리턴해도 상관없음.
    public static void DFS(int level, int end, int sum, int limit) {
        if (level > end) return;
        if (maxWeight < (sum + arr[level]) && (sum + arr[level]) <= limit) maxWeight = (sum + arr[level]);
        DFS(level + 1, end, sum + arr[level], limit);
        DFS(level + 1, end, sum, limit);
    }
}
