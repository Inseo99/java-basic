package day4.methodReturn;

public class Exam {
    public static void main(String[] args) {
        ExamTest t1 = new ExamTest();

        //문제 1
        int a = t1.func1();
        System.out.println(a);
        // 출력 : 10
        int b = t1.func1();
        System.out.println(b);
        // 출력 : 10

        int c = t1.func2(22);
        System.out.println(c);
        // 출력 : 22

        int d = t1.func2(55);
        System.out.println(d);
        // 출력 : 55

        int e = t1.func3(10);
        System.out.println(e);
        // 출력 : 100
        int f = t1.func3(5);
        System.out.println(f);
        // 출력 : 25

        int g = t1.func4(10, 30);
        System.out.println(g);
        // 출력 : 40

        int h = t1.func4(20, 50);
        System.out.println(h);
        // 출력 : 70


        // 문제 2
        int rst1 = t1.plus(10, 20);
        System.out.println(rst1);  // 출력 : 30

        int rst2 = t1.minus(10, 20);
        System.out.println(rst2); // 출력 : -10

        int rst3 = t1.multiple(5, 4);
        System.out.println(rst3); // 출력 : 20

        int rst4 = t1.divide(10, 3);
        System.out.println(rst4); // 출력 : 3

        int rst5 = t1.square(5);
        System.out.println(rst5); // 출력 : 25


        // 문제 3
        // 0은 양수로 보겠습니다.
        int no = 5;

        if(t1.isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.


        // 문제 4
        // 1 부터 n까지 수 중 짝수인 것만 출력
        // Test class에 있는 printEven과 isEven을 완성하여 해결해주세요.

        t1.printEven(10); // 출력: 2 4 6 8 10
        t1.printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        t1.printEven(5); // 출력: 2 4
    }
}
