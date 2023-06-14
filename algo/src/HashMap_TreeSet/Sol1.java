package HashMap_TreeSet;

import java.util.*;

public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            String word = String.valueOf(s.charAt(i));
            // map.getOrDefault(word, 0)+1); 를 활용할 수 있다.
            if(map.get(word) == null) {
                map.put(word, 1);
            }else {
                int value = map.get(word);
                map.put(word, ++value);
            }
        }

        int max = Integer.MIN_VALUE;
        String key = null;

        // keyset 을 통해서 key 만 가지고 온다음에, getvalue로 벨류값만 비교할 수 있다.
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println(key == null ? "존재하지 않는값." : key);
    }
}
