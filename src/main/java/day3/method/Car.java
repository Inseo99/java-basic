package day3.method;

public class Car {
    int num;
    int count;
    int speed;

    public void drive() {
        for (int i = 0; i < num; i++) {
            System.out.println("자동차가 달립니다.");
        }
    }

    public void race() {
        System.out.println("자동차가 최대속력 " + speed + "km로 달립니다.");
    }


}
