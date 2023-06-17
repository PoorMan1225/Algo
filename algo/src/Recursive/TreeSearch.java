package Recursive;

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


//        F_DFS(root);
//        M_DFS(root);
        A_DFS(root);
    }
    // -- 전위 순회 --
    // 1 2 4 5 3 6 7
    public static void F_DFS(Node node) {
        if(node==null) {
           return;
        }else {
            System.out.print(node.idx);
            F_DFS(node.lt);
            F_DFS(node.rt);
        }
    }

    // -- 중위 순회 --
    // 4 2 5 1 3 6 7
    public static void M_DFS(Node node) {
        if(node == null) {
            return;
        }else {
            M_DFS(node.lt);
            System.out.print(node.idx);
            M_DFS(node.rt);
        }
    }

    // -- 후위 순회 --
    public static void A_DFS(Node node) {
        if(node == null) {
            return;
        }else {
            A_DFS(node.lt);
            A_DFS(node.rt);
            System.out.print(node.idx);
        }
    }
}
