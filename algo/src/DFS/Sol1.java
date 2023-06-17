package DFS;

import java.util.Arrays;
import java.util.Scanner;

public class Sol1 {
    public static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        check = new boolean[n + 1];
        Arrays.fill(check, true);
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        DFS(arr, 0);
    }

    public static void DFS(int[] arr, int idx) {
        // base 케이스에 갔을때 마지막에 도착 했으므로
        // 체크한 녀석들을 출력 해야 한다.
        // 키 포인트는 마지막에 도착 했을때 출력한다는 것이다.
        if (idx >= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (check[i]) {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
            return;
        }
        DFS(arr, idx + 1);
        check[idx] = false;
        DFS(arr, idx + 1);
        check[idx] = true;
    }
}
