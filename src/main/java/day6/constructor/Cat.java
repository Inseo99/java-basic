package day6.constructor;

public class Cat {
    String name;
    String kind;
    int age;

    public Cat() {
        System.out.println("고양이가 태어납니다.");
    }

    public void meow() {
        System.out.printf(" %d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
    }
}

