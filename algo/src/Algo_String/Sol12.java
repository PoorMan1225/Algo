package Algo_String;

import java.util.Scanner;

public class Sol12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String s = sc.next().trim()
                .replace('#', '1')
                .replace('*', '0');

        StringBuilder answer = new StringBuilder();

        for(int i=0; i<c*7; i+=7) {
            String subs = s.substring(i, i+7);
            int parse = Integer.parseInt(subs, 2);
            answer.append((char) parse);
        }
        System.out.println(answer);

        // 사실 받은 문자열을 s 를 다시 자르면 끝난다.
        // 이경우 두개의 substring 이 필요하다 0, 7 까지 짜른 tmp 를 int로 변경하고
        // 7부터 끝까지 짜른 문자를 다시 s 에 넣어야한다.
//        for(int i=0; i<c; i++) {
//            String tmp = s.substring(0, 7);
//            int parse = Integer.parseInt(tmp, 2);
//            s = s.substring(7);
//        }
    }
}
