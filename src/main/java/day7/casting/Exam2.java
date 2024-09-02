package day7.casting;

public class Exam2 {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();

        weapon = new Bow();
        weapon = new Spear();

        weapon.attack();

    }
}

class Weapon {
    public void attack() {
        System.out.println("공격하다.");
    }
}

class Bow extends Weapon{

}

class Spear extends Weapon{

}