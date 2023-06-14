package Algo_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>(c);
        for(int i=0; i<c; i++) {
            list.add(new ArrayList<>());
            for(int j=0; j<c; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        solution(list);
    }
    public static void solution(List<List<Integer>> list) {
        int result = 0;
        for(int i=0; i<list.size(); i++) {
            // 행값 더하기.
            int rowSum = 0; int colSum = 0;
            for(int j=0; j<list.size(); j++) {
                rowSum += list.get(i).get(j);
                colSum += list.get(j).get(i);
            }
            result = Math.max(result, rowSum);
            result = Math.max(result, colSum);
        }
        int c = 0; int y = 0;
        for(int j=0; j<list.size(); j++) {
            c += list.get(j).get(j);
            y += list.get(j).get(list.size()-1-j);
        }
        result = Math.max(result, c);
        result = Math.max(result, y);
        System.out.println(result);
    }
}


