package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 인접리스트 {
    static LinkedList<LinkedList<Integer>> linkedList;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        linkedList = new LinkedList<>();
        check = new boolean[n+1];

        for (int i = 0; i < e; i++) {
            int node = sc.nextInt();
            int edge = sc.nextInt();
            try {
                linkedList.get(node-1).add(edge);
            }catch (IndexOutOfBoundsException ex) {
                linkedList.add(node-1, new LinkedList<>());
                linkedList.get(node-1).add(edge);
            }
        }
        System.out.println(DFS(1, 5));
    }

    public static int DFS(int level, int target) {
        if(level == target) {
            return 1;
        }
        int total = 0;
        for(int i=0; i<linkedList.get(level-1).size(); i++) {
            int value = linkedList.get(level-1).get(i);
            if(!check[value] && value == target) {
                return total+1;
            }
            if(!check[value]) {
                check[level] = true;
                total += DFS(level+1, target);
                check[level] = false;
            }
        }
        return total;
    }
}
