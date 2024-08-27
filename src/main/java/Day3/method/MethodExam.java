package Day3.method;

public class MethodExam {
    public static void main(String[] args) {
        // 문제 : 자동차가 3번 달리게 해주세요.
        // 출력 : 자동차가 달립니다.

        //v1. 1개의 자동차가 3번 달리게 해주세요.

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.

        Car c1 = new Car();
        c1.num = 1;
        c1.count = 3;

        for (int i = 0; i < c1.count; i++) {
            c1.drive();
        }

        Car c2 = new Car();
        c2.num = 3;
        c2.count = 1;

        for (int i = 0; i < c2.count; i++) {
            c2.drive();
        }

        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.

        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.

        Car c3 = new Car();
        c3.speed = 220;
        Car c4 = new Car();
        c4.speed = 250;

        c3.race();
        c4.race();

    }
}
