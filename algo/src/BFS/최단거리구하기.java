package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 최단거리구하기 {

    public static boolean[] check;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        int[] arr = {1, -1,  5};
        check = new boolean[10001];
        Queue<Integer> queue = new LinkedList<>();
        int L = 0;
        queue.offer(s);
        check[s] = true;
        label:while (!queue.isEmpty()) {
            int length = queue.size();
            L++;
            for(int i=0; i<length; i++) {
                int v = queue.poll();
                for(int j=0; j<arr.length; j++) {
                    int nx = v + arr[j];
                    // 정답을 찾을 수 없다면 10000 까지 넘어 갈 수 있을 것이다.
                    if(!check[nx] && nx <= 10000) {
                        check[nx] = true;
                        queue.offer(nx);
                    }
                    if(nx == e) {
                        System.out.println(L);
                        break label;
                    }
                }
            }
        }
    }
}
