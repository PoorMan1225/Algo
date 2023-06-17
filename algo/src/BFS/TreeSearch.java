package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSearch {
    public static class Node {

        public Node(int idx) {
            this.idx = idx;
        }

        public Node(int idx, Node lt, Node rt) {
            this.idx = idx;
            this.lt = lt;
            this.rt = rt;
        }

        public int idx;
        public Node lt;
        public Node rt;
    }

    public static void main(String[] args) {
        // --- node 그림 --
        //     1
        //   2    3
        // 4  5  6  7

        Node root = new Node(1);
        root.lt = new Node(2);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt = new Node(3);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
//        BFS(queue);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0; i<len; i++) {
                Node node = queue.poll();
                System.out.println(L + " : " + node.idx);
                if(node.lt != null) queue.offer(node.lt);
                if(node.rt != null) queue.offer(node.rt);
            }
            L++;
        }
    }

    public static void BFS(Queue<Node> queue) {
        if (queue.isEmpty()) return;
        Node node = queue.poll();
        System.out.print(node.idx);
        if (node.lt != null)
            queue.offer(node.lt);
        if (node.rt != null)
            queue.offer(node.rt);
        BFS(queue);
    }
}