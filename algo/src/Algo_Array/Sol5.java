package Algo_Array;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] arr = new int[c-1];

        for(int i=2; i<=c; i++) {
            arr[i-2] = i;
        }
        // 때로는 최적화가 안좋은 경우 인게 많다.
        // 배열의 크기를 두칸 늘려서 인덱스 2부터 시작한게 숫자 2였다면
        // 오히려 코드 짜는데 편했을 수 있다.
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == -1) {
                continue;
            }
            count++;
            for(int j=i; j<arr.length; j+=arr[i]) {
                if(arr[j] != arr[i]) {
                    arr[j] = -1;
                }
            }
        }
        System.out.println(count);
    }
}
