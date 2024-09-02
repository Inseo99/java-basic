package day6.vending;

import java.util.ArrayList;

public class VendingMachine {

    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠
    int total = 0;

    ArrayList<Beverage> beverages = new ArrayList<>();

    public VendingMachine() {
        Beverage b1 = new Beverage("콜라", 1000, 1);
        Beverage b2 = new Beverage("사이다", 1200, 2);
        Beverage b3 = new Beverage("커피", 800, 3);
        beverages.add(b1);
        beverages.add(b2);
        beverages.add(b3);
    }

//    ArrayList<Integer> price = new ArrayList<>(List.of(1000, 1200, 800));

    public void inputMoney(int money) {
//        total = total + money; // 증감연산
        // 증감연산의 경우 짧게 표현하는 방법 존재.
        total += money; // 위와 같은 코드
    }

    public String selectBeverage(int choice) {
        Beverage beverage = beverages.get(choice);
        if (total < beverage.price) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감
        }
        if (beverage.quantity < 1) {
            return "수량 부족";
        }
        total -= beverage.price;
        beverage.quantity--;
        return beverage.drink;
    }

    public int getRemainder() {
        return total;
    }

    public void printBeverages() {
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println(i + ". " + beverages.get(i).drink + " : " + beverages.get(i).price + "원, 남은 수량 : " + beverages.get(i).quantity);
        }
    }
}
