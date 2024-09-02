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
        weapon.weapon(name);
    }
    void introduce() {
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
    }

}

class Weapon {
    public void weapon(String name) {
        System.out.println("무기를 들고 싸운다.");
    }
}

class Bow extends Weapon {
    String name;
    public void weapon(String name) {
        System.out.println(name + "이/가 활로 공격합니다.");
    }
}

class Sword extends Weapon {
    String name;
    public void weapon(String name) {
        System.out.println(name + "이/가 칼로 공격합니다.");
    }
}