package Algo_Array;

import java.util.Scanner;

public class Sol11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[][] arr = new int[c][5];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int banjang = 0;
        int sum = Integer.MIN_VALUE;
        // 행을 기준으로 둘지 열을 기준으로 둘지
        // 어떤것이 편할지 판단해서 체크하는것이 낫다.
        // 이문제의 경우 행을 기준으로 체크했으면 하나의 학생만 체크하면서 같으면 break 를 걸면되니까 편했는데,
        // 열을 기준으로 체크할경우 여러명의 학생을 기준으로 체크학 되니 체크 배열이 하나더 필요해지게 딘다.
        for(int i=0; i<c; i++) {
            int cnt = 0;
            for(int j=0; j<c; j++) {
                for(int k=0; k<c; k++) {
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > sum) {
                sum = cnt;
                banjang = i;
            }
        }
        System.out.println(banjang+1);
//        solution(arr);
    }

    private static void solution(int[][] arr) {
        int banjang = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            boolean[] checks = new boolean[arr.length];
            for(int j=0; j<arr[i].length; j++) {
                for(int k=0; k<arr.length; k++) {
                    if(k == i) continue;
                    if(!checks[k]) {
                        if(arr[i][j] == arr[k][j]) {
                            checks[k] = true;
                            count++;
                        }
                    }
                }
            }
            if(sum < count) {
                sum = count;
                banjang = i;
            }
        }
        System.out.println(banjang+1);
    }
}


