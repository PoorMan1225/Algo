package DFS;

import java.util.*;

/**
 * 합이같은 부분집합 (DFS)
 */
public class Sol2 {
    public static List<List<Integer>> setList;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        setList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = DFS(1, n, 0);
        System.out.println(result ? "YES" : "NO");
    }

    public static boolean DFS(int level, int end, int sum) {
        if (level > end) {
            int total = Arrays.stream(arr).sum();
            return total - sum == sum;
        }
        if(DFS(level + 1, end, sum + arr[level])) {
            return true;
        }
        if(DFS(level+1, end, sum)) {
            return true;
        }
        return false;
    }
}
