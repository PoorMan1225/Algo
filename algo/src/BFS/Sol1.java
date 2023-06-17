package BFS;

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        int[] value = { 1, -1,  5};
        int count = 0;
        while (s != e) {
            ++count;
            int a = s+value[0];
            int b = s+value[1];
            int c = s+value[2];
            int _a = Math.abs(e - a);
            int _b = Math.abs(e - b);
            int _c = Math.abs(e - c);
            int r = Math.min(Math.min(_a, _b), _c);
            if(r == _a) {
                s = a;
            }else if(r == _b) {
                s = b;
            }else {
                s = c;
            }
        }
        System.out.println(count);
    }
}
