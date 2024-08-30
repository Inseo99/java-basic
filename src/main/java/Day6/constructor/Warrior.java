package Day6.constructor;

public class Warrior {

    // 상태
    String name;
    int attack;
    int defense;

    public Warrior() {
        System.out.println("전사가 태어납니다.");
    }

    // 동작
    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", name, attack, defense);
    }
    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙민다.\n", name, attack);
    }
    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다..\n", name, defense);
    }
}
