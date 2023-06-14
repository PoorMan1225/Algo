package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        solution(n, k);
    }

    public static void solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) queue.offer(i);

        int count = 0;
        while (queue.size() != 1) {
            if(++count % k != 0) {
                queue.offer(queue.poll());
            }else {
                queue.poll();
            }
        }
        System.out.println(queue.poll());
    }
}
