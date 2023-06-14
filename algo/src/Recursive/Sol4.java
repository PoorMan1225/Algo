package Recursive;

import java.util.Scanner;

public class Sol4 {
    // 외부 변수를 이용해서 재귀로 이미 구한 값을 저장해놓은 다음.
    // 그값이 들어있다면 해당 값을 그냥 리턴한다.
    // 이것이 가능한 이유는 재귀함수는 항상 구조가 동일하기 때문에 가능하다.
    // 메모제이션을 사용할 경우 좀더 적은 값을 먼저 구한것이 더 성능이 좋다.
    // 큰값은 항상 작은 값을 포함하기 때문에 바로 값을 찾을 수 있게 된다. 
    static int[] fibo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n+1];
        fibonacci(n);
        for(int i=1;i<=n; i++)
            System.out.print(fibo[i]);
    }

    public static int fibonacci(int num) {
        if(fibo[num] > 0) return fibo[num]; // 메모제이션
        if(num==1) return fibo[num]=1;
        else if(num==2) return fibo[num]=1;
        else return fibo[num] = fibonacci(num-2) + fibonacci(num-1);
    }
}
