package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_최단거리_2 {

    public static LinkedList<LinkedList<Integer>> graph;
    public static boolean[] check;
    public static int[] distance;
    public static Queue<Integer> queue;

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
        check = new boolean[n + 1];
        distance = new int[n + 1];

        queue.offer(1);
        check[1] = true;

        // level 로 구하는 것이 아님.
        while (!queue.isEmpty()) {
            int nodeIdx = queue.poll();
            for (int node : graph.get(nodeIdx - 1)) {
                if (!check[node]) {
                    check[node] = true;
                    distance[node] = distance[nodeIdx] + 1;
                    queue.offer(node);
                }
            }
        }
        System.out.println(Arrays.toString(distance));
    }
}
