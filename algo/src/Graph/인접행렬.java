package Graph;

import java.util.Scanner;

public class 인접행렬 {

    public static int[][] arr;
    public static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        arr = new int[n + 1][n + 1];
        check = new boolean[n+1];

        for (int i = 0; i < e; i++) {
            int node = sc.nextInt();
            int edge = sc.nextInt();
            arr[node][edge] = 1;
        }
        System.out.println(DFS(1, 5));
    }

    public static int DFS(int start, int target) {
        if (start == target) {
            return 1;
        }
        int total = 0;
        for (int i = 1; i <= target; i++) {
            if (arr[start][i] != 0 && !check[i]) {
                //i 로 체크하면 안되는 이유는.
                // 레벨로 체크 해야 하는데 4레벨에서 3레벨로 돌아왔을때
                // 그다음 인덱스에서 다시 4레벨로 갈때 4레벨이 체크가 되어야 하는데
                // 인덱스가 체크가 되어버리면서 뭔가 이상하게 꼬일 수 있다.
                check[start] = true;
                total += DFS(start+1, target);
                check[start] = false;
            }
        }
        return total;
    }
}
