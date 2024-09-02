package day7.inheritance.duck;

public class RebberDuck extends Duck {
    public void fly() {
        System.out.println("저는 날 수 없어요.");
    }

    public void swim() {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
