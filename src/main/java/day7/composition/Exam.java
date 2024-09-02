package day7.composition;

public class Exam {
    public static void main(String[] args) {
        // 출력 : 아래와 같이 출력되게 해주세요.
        // 출력 : 100cm

        Person p1 = new Person();
        p1.age = 20;
        p1.arm = new Arm(); // Arm 타입.

        System.out.println(p1.arm.length + "cm");

        // 객체가 가지고있는 변수, 메서드
        // ()

    }
}

class Person{
    int age;
    Arm arm;

}

class Arm {
    int length;

    public Arm() {
        length = 100;
    }
}