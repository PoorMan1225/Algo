package Stack_Queue;

import java.util.*;

public class Sol7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(arr, n, m);
    }

    public static void solution(int[] arr, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        // 배열이 아니라 클래스로 만드는것이 낫다.
        for(int i=0; i<n; i++) queue.offer(new int[]{ i, arr[i]});
        int count = 0;
        while (true) {
            int[] kv = queue.poll();
            int s = queue.size();
            // 플래그 값 보다는. kv 변수를 다시 활용할 생각을 해본다.
            // 플래그값이 추가 되면 코드가 복잡해진다.
            boolean flag = false;
            for(int i=0; i<s; i++) {
                int[] pkv = queue.poll();
                if(kv[1] < pkv[1]) {
                   flag = true;
                }
                queue.offer(pkv);
            }
            if(!flag) {
                count++;
                if(kv[0] == m) break;
            }else {
                queue.offer(kv);
            }
        }
        System.out.println(count);
    }
}
