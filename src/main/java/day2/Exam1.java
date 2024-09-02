package day2;
public class Exam1 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기
        /* 출력예시 :

        2 * 2 = 4
        2 * 4 = 8
        2 * 6 = 12
        2 * 8 = 16

        ...

        9단까지 이런식으로 나오면 됩니다.

        */

        for (int i = 2; i < 10; i++ ) {
            for (int j = 2; j < 10; j += 2) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }

        // 문제

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (int x = n; x <= m; x++) {
            if (x % 2 == 1) {
                for (int y = 2; y <= limit; y += 2) {
                    System.out.println(x + " X " + y + " = " + x * y);
                }

            }
        }

        // 문제

        // 사각형만들기

        for (int hegiht = 0; hegiht < 3; hegiht++) {
           for (int width = 0; width < 6; width++) {
                System.out.print("*");
           }
            System.out.println();
        }

        // 삼각형만들기 1

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 삼각형만들기 2

        int y = 6;

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y-i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 삼각형 만들기 3

        int u = 6;
        int star_len = 0;

        for (int i = 0; i < u; i++ ) {
            int increase = 0;
            int decrease = 0;

            // u 가 짝수 일 경우
            if ( u % 2 == 0 ) {
                if ( u / 2 > i ) {
                    increase = 1;
                }
                else if ( u / 2 < i ) {
                    decrease = 1;
                }
            }
            // count 가 홀수 일 star_len
            else {
                if ( u / 2 >= i ) {
                    increase = 1;
                }
                else {
                    decrease = 1;
                }
            }

            if ( increase == 1 ) {
                star_len++;
            }

            if ( decrease == 1) {
                star_len--;
            }

            for ( int j = 0; j < star_len; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
