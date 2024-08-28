package Day4.instanceVar;

public class InstanceVar {
    public static void main(String[] args) {

        // 매개변수를 이용해 동작을 다채롭게
        Person p1 = new Person();
        p1.intro();
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.name = "이순신";
        p2.intro();

        p1.wark();
        p2.wark();



    }
}
