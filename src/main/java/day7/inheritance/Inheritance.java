package day7.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.moew();
        c1.breathe();

        Person p1 = new Person();
        p1.breathe();
    }

    // 중복 -> 가장 기피해야하는 대상

    // extends -> 클래스의 확장

}
