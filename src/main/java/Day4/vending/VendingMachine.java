package Day4.vending;

public class VendingMachine {

    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠
    int total = 0;

    String[] drink = {"콜라", "사이다", "커피"};
    int[] price = {1000, 1200, 800};
    int[] quantities = {2, 3, 4};

    public void inputMoney(int money) {
//        total = total + money; // 증감연산
        // 증감연산의 경우 짧게 표현하는 방법 존재.
        total += total; // 위와 같은 코드
    }

    public String selectBeverage(int choice) {
        if (total < price[choice]) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감
        }
        if (quantities[choice] < 1) {
            return "수량 부족";
        }
//        total = total - price[choice];
        total -= price[choice];
//        quantities[choice] = quantities[choice] - 1;
         quantities[choice] -= 1;
        return drink[choice];
    }

    public int getRemainder() {
        return total;
    }

    public void printBeverages() {
        for (int i = 0; i < drink.length; i++) {
            System.out.println(i + ". " + drink[i] + " : " + price[i] + "원, 남은 수량 : " + quantities[i]);
        }
    }
}
