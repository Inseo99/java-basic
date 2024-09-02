package day7.polymopism;

public class Exam {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.age = 20;

        warrior.weapon = new Bow();
        warrior.weapon = new Sword();

        warrior.attack();
    }
}

class Warrior {
    int age;
    String name;
    Weapon weapon;

    public void attack() {
        weapon.attack(name);
    }
    public void introduce() {
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
    }
    public void useSkill() {
        weapon.useSkill(name);
    }


}

class Weapon {
    public void attack(String name) {
        System.out.println("무기를 들고 싸운다.");
    }
    public void useSkill(String name) {
        System.out.println("스킬을 사용한다.");
    }
}

class Bow extends Weapon {
    public void attack(String name) {
        System.out.println(name + "이/가 활로 공격합니다.");
    }
    public void useSkill(String name) {
        System.out.println(name + "이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.");
    }
}

class Sword extends Weapon {
    public void attack(String name) {
        System.out.println(name + "이/가 칼로 공격합니다.");
    }
    public void useSkill(String name) {
        System.out.println(name + "이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.");
    }
}
