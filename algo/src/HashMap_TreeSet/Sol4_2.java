package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sol4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        solution(s, t);
    }

    public static void solution(String s, String t) {
        // 슬라이딩 윈도우를 적용할 map
        Map<Character, Integer> map1 = new HashMap<>();
        // 비교할 데이터를 보관할 map
        Map<Character, Integer> map2 = new HashMap<>();
        int startIndex = 0;
        int endIndex = 0;
        int count = 0;
        char[] array = s.toCharArray();
        for(endIndex=0; endIndex<t.length(); endIndex++) {
            map1.put(array[endIndex], map1.getOrDefault(array[endIndex], 0)+1);
            map2.put(t.charAt(endIndex), map2.getOrDefault(t.charAt(endIndex), 0)+1);
        }

        if(map2.equals(map1)) count++;

        for (; endIndex<s.length(); endIndex++, startIndex++) {
            map1.put(array[startIndex], map1.get(array[startIndex])-1);
            if(map1.get(array[startIndex]) == 0) map1.remove(array[startIndex]);
            map1.put(array[endIndex], map1.getOrDefault(array[endIndex], 0)+1);
            if(map2.equals(map1)) count++;
        }
        System.out.println(count);
    }
}
