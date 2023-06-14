package Sorting_Searching;

import java.util.*;

public class Sol7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int start = 0;
        int end = n-1;
        int middle = -1;

        while (start <= end) {
            middle = (start + end) / 2;
            if(arr[middle] < m) {
                start = middle+1;
            }else if(arr[middle] == m) {
                break;
            }else {
                end = middle-1;
            }
        }
        System.out.println(middle);
        System.out.println(binarySearch(arr, 0, n-1, m));
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        if(start > end) return -1;
        int middle = start + end / 2;
        if(arr[middle] > target) {
            return binarySearch(arr, start, end-1, target);
        } else if(arr[middle] == target) {
            return middle;
        } else {
            return binarySearch(arr, start+1, end, target);
        }
    }
}
