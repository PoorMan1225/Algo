package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Sol9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int lt = 0;
        int rt = n-1;
        int[] mArr = new int[c];
        for(int i=0; i<c; i++) {
            int middle = lt + rt / 2;
            int a = Math.abs(arr[middle] - arr[lt]);
            int b = Math.abs(arr[middle]- arr[rt]);
            if(a > b) {
                mArr[i] = arr[lt];
                lt = lt+1;
            }else if(a == b) {
                mArr[i] = arr[rt];
                rt = rt-1;
            }else  {
                mArr[i] = arr[rt];
                rt = rt-1;
            }
        }
        System.out.println(Arrays.toString(mArr));
    }
}
