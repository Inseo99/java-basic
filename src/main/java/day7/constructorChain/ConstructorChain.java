package day7.constructorChain;

public class ConstructorChain {
    public static void main(String[] args) {
        WhiteDuck wd = new WhiteDuck();
        wd.fly();
    }
}


class Duck {
    public Duck() {
        System.out.println("Duck이 생성됩니다.");
    }
    public void fly() {
        System.out.println("오리가 납니다.");
    }
}

class WhiteDuck extends Duck {
    public WhiteDuck() {
        System.out.println("WhiteDuck이 생성됩니다.");
    }
}