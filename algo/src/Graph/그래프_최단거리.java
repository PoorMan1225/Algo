package Graph;

import java.util.*;

public class 그래프_최단거리 {

    public static LinkedList<LinkedList<Integer>> graph;
    public static Queue<Integer> queue;
    public static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new LinkedList<>());
        }
        for (int i = 0; i < m; i++) {
            int node = sc.nextInt();
            int edge = sc.nextInt();
            graph.get(node - 1).add(edge);
        }
        queue = new LinkedList();
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        // 노드의 레벨 방식
        for(int i=2; i<=6; i++) {
            if(memo[i] >= 0) {
                System.out.println(i + " : " + memo[i]);
            }else {
                BFS(1, i);
            }
        }
    }

    public static void BFS(int start, int end) {
        int L = 0;
        queue.clear();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int idx = queue.poll();
                if(memo[idx] == -1) {
                    memo[idx] = L;
                }
                if (idx == end) {
                    System.out.println(end + " : " + L);
                    return;
                }
                LinkedList<Integer> nodes = graph.get(idx - 1);
                for (Integer node : nodes) {
                    queue.offer(node);
                }
            }
            L++;
        }
    }
}
