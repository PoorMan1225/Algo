package Algo_TwoPointer_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] arr1 = new int[s];
        for (int i = 0; i < s; i++) {
            arr1[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        int[] arr2 = new int[d];
        for (int i = 0; i < d; i++) {
            arr2[i] = scanner.nextInt();
        }
        findCommonElement(s, d, arr1, arr2);
    }

    public static void findCommonElement(int p, int s, int[] arr1, int[] arr2) {
        ArrayList<Integer> common = new ArrayList<>(s + p);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < p && idx2 < s) {
            if (arr1[idx1] == arr2[idx2]) {
                common.add(arr1[idx1]);
                idx1++;
                idx2++;
                continue;
            }
            if (arr1[idx1] > arr2[idx2]) {
                idx2++;
            } else {
                idx1++;
            }
        }
        for(int i=0; i<common.size(); i++) {
            System.out.print(common.get(i)+" ");
        }
    }
}
