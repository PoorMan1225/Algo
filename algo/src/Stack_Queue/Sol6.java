package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        String g = sc.next();
        solution(p, g);
    }

    public static void solution(String p, String g) {
        Queue<Character> pqueue = new LinkedList<>();
        Queue<Character> gqueue = new LinkedList<>();
        for (char c : p.toCharArray()) pqueue.offer(c);
        for(char c : g.toCharArray()) {
            if(pqueue.contains(c)) gqueue.offer(c);
        }
        System.out.println(pqueue.equals(gqueue) ? "YES" : "NO");
    }
}
