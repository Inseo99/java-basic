package day7.polymopism;

public class Exam2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();

        String name = "홍길동";
        warrior.name = name;
        warrior.age = 20;
        warrior.introduce();
        // 안녕하세요 저는 20살 홍길동입니다.

        warrior.weapon = new Bow();
        warrior.attack();
        // 출력 : 홍길동이/가 활로 공격합니다.

        warrior.weapon = new Sword();
        warrior.attack();
        // 출력 : 홍길동이/가 칼로 공격합니다.
    }
}

