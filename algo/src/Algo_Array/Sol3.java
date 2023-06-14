package Algo_Array;

import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] aArray = new int[c];
        for (int i = 0; i < c; i++) {
            aArray[i] = sc.nextInt();
        }
        int[] bArray = new int[c];
        for (int i = 0; i < c; i++) {
            bArray[i] = sc.nextInt();
        }
        // 비기는 것을 먼저 생각 했었다면
        // 이기는 경우 else 지는 경우 이렇게 간단하게 끝날 수 있다.

        for (int i = 0; i < c; i++) {
            if (aArray[i] == 1 && bArray[i] == 2
                    || aArray[i] == 2 && bArray[i] == 3 ||
                    aArray[i] == 3 && bArray[i] == 1) {
                System.out.println("B");
            } else if (aArray[i] == 1 && bArray[i] == 3
                    || aArray[i] == 2 && bArray[i] == 1 ||
                    aArray[i] == 3 && bArray[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("D");
            }
        }
    }
}
