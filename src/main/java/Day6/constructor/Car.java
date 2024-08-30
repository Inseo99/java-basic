package Day6.constructor;

public class Car {
    String model;
    String color;
    int speed;

    public Car() {
        System.out.println("자동차가 만들어집니다.");
    }

    public void drive() {
        System.out.println(color + model + "이/가 시속 " + speed + "km로 달립니다.");
    }
}
