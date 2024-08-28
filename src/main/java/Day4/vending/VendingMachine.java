package Day4.vending;

import java.util.Scanner;

public class VendingMachine {

    int total = 0;
    String[] drink = {"콜라", "사이다", "커피"};
    int[] price = {1000, 1200, 800};

    public void inputMoney(int money) {
        total = total + money;
    }

    public String selectBeverage(int choice) {
        total = total- price[choice];
        return drink[choice];
    }

    public int getRemainder() {
        return total;
    }

    public void printBeverages() {
        for (int i = 0; i < drink.length; i++) {
            System.out.println(i + ". " + drink[i] + " : " + price[i]  + "원");
        }
    }

}
