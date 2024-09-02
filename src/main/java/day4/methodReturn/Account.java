package day4.methodReturn;

public class Account {

    int total = 0;

    public void deposit(int money) {
        total = total + money;
        System.out.println(money + "원을 예금했습니다.");
    }

    public int withdraw(int money) {
        total = total - money;
        return money;
    }

    public int getRemainder() {
        return total;
    }
}
