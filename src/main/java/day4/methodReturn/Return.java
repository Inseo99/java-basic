package day4.methodReturn;


// 메서드는 값을 표현할 수도 있고 아닐 수도 있다.
public class Return {
    public static void main(String[] args) {


        // 메서드는 값을 리턴할 수 있는데 리턴값이 필요한 이유는 메서드가 리턴한 값을 다양하게 2차 작업 할 수 있기 때문
        Test t1 = new Test();
        t1.plus(10, 20); // 30

        // 10, 20 더한 값에서 2로 나누고 싶다.
        int num = t1.plus(10, 20);

        System.out.println(num / 2);

        // 10, 20 더한 값에서 2배를 하고싶다.
        System.out.println(num * 2);


        // 문제. Teat에 원의 넓이 구하는 메서드 만들기
        // 원의 넓이 : 반지름 * 반지름 * 3.14

        // 반지름이 5인 원의 넓이 :
        double result = t1.circle(5);

        // 반지름이 10인 원의 넓이 :
        double result2 = t1.circle(10);

        // 반지름인 5인 원의 넓이를 3으로 나눈 값 :
        System.out.println(result / 3);

        // 반지름인 10인 원의 넓이를 2배로 증가시킨 값 :
        System.out.println(t1.circle(10) * 2);

    }
}
