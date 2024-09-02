package day4.methodReturn;

public class ExamTest {

    // 문제1
    public int func1() {
        return 10;
    }

    public int func2(int num) {
        return num;
    }

    public int func3(int num) {
        return num * num;
    }

    public int func4(int num1, int num2) {
        return num1 + num2;
    }


    // 문제2
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int square(int num) {
        return num * num;
    }


    // 문제3
    public boolean isNegative(int num) {
        return 0 > num;
    }

    // 문제 4
    public void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}