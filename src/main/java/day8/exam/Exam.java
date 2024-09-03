package day8.exam;

public class Exam {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 22;

        p1.introduce();

        Person p2 = new Person();
        p2.name = "홍길순";
        p2.age = 25;

        p2.introduce();

        p1.name = "홍길동";
        p1.age = 22;

        p1.introduce();
    }
}
