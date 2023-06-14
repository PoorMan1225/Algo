package HashMap_TreeSet;

import java.util.*;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        boolean flag = true;
        for(int value : map.values()) {
            if(value % 2 != 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
