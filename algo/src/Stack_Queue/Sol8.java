package Stack_Queue;

import java.util.Scanner;

public class Sol8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        solution(arr, n, s);
    }

    public static void solution(int[] arr, int n, int s) {
        int[] cache = new int[s];
        cache[0] = arr[0];
        for (int i = 1; i < n; i++) {
            // 해야할 작업이 캐시에 없는 상태라면.
            int idx = -1;
            for (int j = 0; j < s; j++) {
                if (arr[i] == cache[j]) {
                    idx = j;
                    break;
                }
            }

            // 캐시가 존재하지 않는다면.
            int con = idx < 0 ? Math.min(i, s-1) : idx;
            for (int j = con; j > 0; j--) {
                cache[j] = cache[j - 1];
            }
            cache[0] = arr[i];
        }
        for(int i=0; i<s; i++) System.out.print(cache[i] +" ");
    }
}
