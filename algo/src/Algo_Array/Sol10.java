package Algo_Array;

import java.util.Scanner;

public class Sol10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[][] arr = new int[c+2][c+2];
        for(int i=1; i<arr.length-1; i++) {
            for(int j=1; j <arr[i].length-1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr);
    }

    private static void solution(int[][] arr) {
        int count = 0;
        for(int i=1; i<arr.length-1; i++) {
            for(int j=1; j<arr[i].length-1; j++) {
                if(arr[i][j] > arr[i][j-1]
                        && arr[i][j] > arr[i-1][j]
                        && arr[i][j] > arr[i][j+1]
                        && arr[i][j] > arr[i+1][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


