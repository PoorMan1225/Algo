package Decision_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        int answer = 1;
        // 두말의 사이에 어떻게든 정답이 있다.

        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            int count = getCount(mid, n, arr);
            if(count >= c) {
                if(answer < mid) answer = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }
        System.out.println(answer);
    }

    public static int getCount(int mid, int n, int[] arr) {
        int count = 1;
        int idx = 0;
        for(int i=1; i<n ; i++) {
            if(Math.abs(arr[idx]-arr[i]) >= mid) {
                count++;
                idx = i;
            }
        }
        return count;
    }
}
