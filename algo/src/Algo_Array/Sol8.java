package Algo_Array;

import java.util.*;

public class Sol8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        List<Integer> list = new ArrayList<>(c);
        for(int i=0; i<c; i++) {
            list.add(sc.nextInt());
        }
        solution2(list);
    }
    public static void solution(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        list.sort(Comparator.reverseOrder());
        copyList.forEach(i -> {
            int rank = list.indexOf(i)+1;
            System.out.print(rank + " ");
        });
    }

    public static void solution2(List<Integer> list) {
        for(int value : list) {
            int rank = 1;
            for (Integer integer : list) {
                if (value == integer) {
                    continue;
                }
                if(value < integer) {
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
    }
}


