package Algo_Array;

import java.util.Scanner;

public class Sol12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int[][] arr = new int[s][t];

        for (int i = 0; i < t; i++) {
            int count = 1;
            for (int j = 0; j < s; j++) {
                arr[sc.nextInt()-1][i] = count++;
            }
        }
        for(int i=0; i <arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
//        solution(s, t, arr);
    }

    private static void solution(int s, int t, int[][] arr) {
        int count = 0;

        for (int i=0; i < s; i++) {
            for (int j = i+1; j < s; j++) {
                boolean flag = arr[i][0] - arr[j][0] > 0;
                boolean check = true;
                for (int k = 1; k < t; k++) {
                    if(flag != arr[i][k] - arr[j][k] > 0) {
                        check = false;
                        break;
                    }
                }
                if(check) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
