package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        solution(s, t);
    }

    public static void solution(String s, String t) {
        int startIndex = 0;
        int endIndex = 0;
        int count = 0;
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (endIndex=0; endIndex<t.length(); endIndex++) {
            map.put(array[endIndex], map.getOrDefault(array[endIndex], 0)+1);
        }
        if(isAnagram(map, t)) count++;

        while (endIndex < s.length()) {
            if(map.get(array[startIndex]) > 1) {
                map.put(array[startIndex], map.get(array[startIndex])-1);
            }else {
                map.remove(array[startIndex]);
            }
            map.put(array[endIndex], map.getOrDefault(array[endIndex], 0)+1);
            if(isAnagram(map, t)) count++;
            endIndex++; startIndex++;
        }
        System.out.println(count);
    }

    public static boolean isAnagram(Map<Character, Integer> map, String t) {
        boolean isAnagram = true;
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()) {
            if(map.get(c) % 2 != 0) {
                isAnagram = false;
                break;
            }
        }

        for(char c : t.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)-1);
            }else {
                map.remove(c);
            }
        }
        return isAnagram;
    }
}
