package Recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> binaryList = new ArrayList<>();
        printBinary(binaryList, n);
        System.out.println(binaryList.toString());
        DFS(n);
    }

    public static void printBinary(List<Integer> binaryList, int num) {
       int m = num / 2;
       int r = num % 2;
       if(m <= 0) {
           binaryList.add(r);
           return;
       }
       printBinary(binaryList, m);
       binaryList.add(r);
    }

    public static void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2+ " ");
        }
    }
}
