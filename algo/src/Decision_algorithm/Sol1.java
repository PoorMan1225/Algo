package Decision_algorithm;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 곡의 개수 .
        int m = sc.nextInt(); // DVD 의 크기.
        int[] arr = new int[n]; // 곡의 길이 배열.
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        // 결정 알골리즘은 정답이 될 수 있는 최소의 값과, 최대의 값 사이에
        // 정답을 이분탐색으로 찾아가는 알고리즘이다. 여기서 중요한 점은
        // 정답이 될 수 있는 최소, 최대의 값과 그것을 구현할 수 있는 조건이다.
        int lt = Arrays.stream(arr).min().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = rt;
        while (lt <= rt) {
            int middle = (lt+rt) / 2;
            int count = 1;
            int sum = 0;
            for(int i=0; i<n; i++) {
              sum += arr[i];
              if(sum <= middle) continue;
              sum=arr[i];
            }
            if(count > m) {
                lt = middle+1;
            }else if(count == m) {
                answer = middle;
                rt = middle-1;
            }else {
                rt = middle-1;
            }
        }
        System.out.println(answer);
    }

}
