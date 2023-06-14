package Algo_String;

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char[] senArr = sentence.toCharArray();
        char[] charArr = new char[sentence.length()];

        // Character.isLowerCase(ch)
        // Character.isUpperCase(ch) 를 활용할 수 도 있다.
        for (int i = 0; i<senArr.length; i++) {
            if(senArr[i] >= 'A' && senArr[i] <= 'Z') {
                charArr[i] = (char) (senArr[i] + 32);
            }else {
                charArr[i] = (char) (senArr[i] - 32);
            }
        }
        System.out.println(new String(charArr));
    }
}
