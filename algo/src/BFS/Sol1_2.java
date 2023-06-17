package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        int[] arr = {1, -1, 5};
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        int count = 0;

        while (!queue.isEmpty()) {
            count++;
            int _s = queue.poll();
            int a = Math.abs(e - (_s + arr[0]));
            int b = Math.abs(e - (_s + arr[1]));
            int c = Math.abs(e - (_s + arr[2]));
            int t = a < b ? a < c ? arr[0] : arr[2] : b < c ? arr[1] : arr[2];
            if(t > 0) queue.offer(_s + t);
        }
        System.out.println(count);
    }
}
