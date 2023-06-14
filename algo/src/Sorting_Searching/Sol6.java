package Sorting_Searching;

import java.util.*;

public class Sol6 {
    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + this.x + " , " + this.y + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> pointList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            pointList.add(new Point(x, y));
        }
        // comparingInt 를 사용하면 then 으로 연결해서 조건을 추가 지정할 수 있다.
        pointList.sort(Comparator
                .comparingInt((Point o) -> o.x)
                .thenComparingInt(o -> o.y));

        pointList.forEach(point -> System.out.println(point.x + " " + point.y));
    }
}
