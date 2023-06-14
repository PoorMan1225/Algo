package Algo_TwoPointer_SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class Sol1 {
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
        printMerge(arr1, arr2);
    }

    public static void printMerger(int[] arr1, int[]arr2) {
        int p1 = 0; int p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        // 먼저 겹치는 부분들을 먼저 넣고
        while (p1<arr1.length && p2<arr2.length) {
            if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        // 그다음 남는 부분들을 넣는다.
        while (p1<arr1.length) answer.add(arr1[p1++]);
        while (p2<arr2.length) answer.add(arr2[p2++]);
    }

    public static void printMerge(int[] arr1, int[] arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int idx1 = 0;
        int idx2 = 0;
        while ((idx1 + idx2) < arr1.length + arr2.length) {
            if(idx1 >= arr1.length) {
                for(int i=idx2; i< arr2.length; i++){
                    mergeArray[idx1+i] = arr2[i];
                }
                break;
            }

            if(idx2 >= arr2.length) {
                for(int i=idx1; i< arr1.length; i++) {
                    mergeArray[idx2+i] = arr1[i];
                }
                break;
            }
            if (arr1[idx1] < arr2[idx2]) {
                mergeArray[idx1+idx2] = arr1[idx1++];
            }else {
                mergeArray[idx1+idx2] = arr2[idx2++];
            }
        }
        printArray(mergeArray);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
