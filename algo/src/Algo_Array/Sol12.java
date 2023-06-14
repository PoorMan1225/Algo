package Algo_Array;

import java.util.Scanner;

public class Sol12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr);
    }

    private static void solution(int[][] arr) {
        // 모든 경우의 수를 구해야 할때 반복문 두개를 활용한다!
        int result = 0;
        for (int i = 0; i < arr[0].length - 1; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                boolean flag = true;
                int idx1 = 0;
                int idx2 = 0;
                for (int k = 1; k < arr.length; k++) {
                    for (int l = 0; l < arr[0].length; l++) {
                        if (arr[0][i] == arr[k][l]) {
                            idx1 = l;
                        }
                        if (arr[0][j] == arr[k][l]) {
                            idx2 = l;
                        }
                    }
                    if (idx1 > idx2) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}


