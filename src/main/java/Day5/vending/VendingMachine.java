package Day5.vending;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠
    int total = 0;

    ArrayList<String> drinks = new ArrayList<>() {{
        add("콜라");
        add("사이다");
        add("커피");
        add("주스");
    }};

    ArrayList<Integer> prices = new ArrayList<>() {{
        add(1000);
        add(1200);
        add(800);
        add(1500);
    }};

    ArrayList<Integer> quantities = new ArrayList<>() {{
        add(2);
        add(1);
        add(3);
        add(2);
    }};

//    ArrayList<Integer> price = new ArrayList<>(List.of(1000, 1200, 800));

    public void inputMoney(int money) {
//        total = total + money; // 증감연산
        // 증감연산의 경우 짧게 표현하는 방법 존재.
        total += money; // 위와 같은 코드
    }

    public String selectBeverage(int choice) {
        if (total < prices.get(choice)) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감
        }
        if (quantities.get(choice) < 1) {
            return "수량 부족";
        }
//        total = total - price[choice];
        total -= prices.get(choice);
//        quantities[choice] = quantities[choice] - 1;
        quantities.set(choice , quantities.get(choice) - 1);
        return drinks.get(choice);
    }

    public int getRemainder() {
        return total;
    }

    public void printBeverages() {
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(i + ". " + drinks.get(i) + " : " + prices.get(i) + "원, 남은 수량 : " + quantities.get(i));
        }
    }
}
