package Day4.methodReturn;

public class Test {

    public int plus(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;  // 메서드가 리턴(돌아갈) 때 10이라는 값을 가지고 돌아감.

    }

    // 실수와 정수를 계산하면 결과는 무조건 실수입니다.
    public double circle(int redius) {
        System.out.println((redius * redius) * 3.14);

        return (redius * redius) * 3.14;


    }
}
