package Algo_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
//        List<Integer> list = new ArrayList<>(c);
//        for(int i=0; i<c; i++) {
//            list.add(reverseNumber(sc.nextInt()));
//        }
//        for(int i=0; i<c; i++) {
//            int number = list.get(i);
//            if(isPrimeNumber(number)) {
//                System.out.print(number+ " ");
//            }
//        }
        System.out.println(reverseNumber(c));
    }

    // 소수인지 판별하기
    public static boolean isPrimeNumber(int num) {
        if(num == 1 || num <= 0) return false;
        if(num == 2 || num == 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i=3; i*i <= num; i+=2) {
            if(num % i == 0) return false;
        }
        return true;
    }

    // 각 숫자를 뒤집기.
    public static int reverseNumber(int num) {
        //  StringBuilder 의 reverse 를 쓰는 방법도 있다. 
        int result = 0;
        while (num > 0) {
            result *= 10;
            result += num % 10;
            num = num / 10;
        }
//        result = result / 10;
        return result;
    }
}


