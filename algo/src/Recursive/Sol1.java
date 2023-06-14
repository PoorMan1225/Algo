package Recursive;

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int num) {
        if(num <= 0) return;
        else {
            print(num-1);
            System.out.println(num);
        }
    }
}
