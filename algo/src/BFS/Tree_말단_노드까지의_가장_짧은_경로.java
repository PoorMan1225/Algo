package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_말단_노드까지의_가장_짧은_경로 {
    public static class Node {
        private int id;
        public Node lt;
        public Node rt;

        public Node(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        label:
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node node = queue.poll();
                if (node.lt == null && node.rt == null) {
                    break label;
                }
                if(node.lt != null) queue.offer(node.lt);
                if(node.rt != null) queue.offer(node.rt);
            }
            L++;
        }
        queue.clear();
        System.out.println(L);
    }
}
