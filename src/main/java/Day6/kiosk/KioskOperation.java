package Day6.kiosk;

import java.util.ArrayList;

public class KioskOperation {
    int total = 0;

    ArrayList<Hamberger> hambergers = new ArrayList<>();
    ArrayList<Hamberger> hambergerCart = new ArrayList<>();
    ArrayList<Side> sides = new ArrayList<>();
    ArrayList<Side> sideCart = new ArrayList<>();
    ArrayList<Drink> drinks = new ArrayList<>();
    ArrayList<Drink> drinkCart = new ArrayList<>();

    public KioskOperation() {
        // 햄버거 목록
        hambergers.add(new Hamberger("한우불고기버거", 6000));
        hambergers.add(new Hamberger("치즈버거", 3000));
        hambergers.add(new Hamberger("치킨버거", 3500));
        hambergers.add(new Hamberger("새우버거", 3200));

        // 사이드 목록
        sides.add(new Side("감자튀김", 1800));
        sides.add(new Side("치즈스틱", 2000));
        sides.add(new Side("치킨너겟", 2500));
        sides.add(new Side("오징어링", 2700));

        // 음료수 목록
        drinks.add(new Drink("콜라", 1000));
        drinks.add(new Drink("에이드", 2000));
        drinks.add(new Drink("커피", 1500));
        drinks.add(new Drink("쉐이크", 2500));
    }

    //햄버거 메서드
    public void hambergerprint() {
        for (int i = 0; i < hambergers.size(); i++) {
            System.out.printf("%d. %s %d \n", (i+1), hambergers.get(i).name, hambergers.get(i).price);
        }
    }

    public String hambergerchoice(int num) {
        Hamberger hamberger = hambergers.get(num-1);
        total += hamberger.price;
        hambergerCart.add(hamberger);
        return hamberger.name;
    }

    public void hambergercancel(int num) {
        System.out.println(hambergerCart.get(num-1).name + "이 취소되었습니다.");
        total -= hambergerCart.get(num-1).price;
        hambergerCart.remove(num-1);
    }

    public void hambergerCartprint() {
        for (int i = 0; i <hambergerCart.size(); i++) {
            System.out.println((i+1) + ". " + hambergerCart.get(i).name);
        }
    }

    // 사이드 메서드
    public void sideprint() {
        for (int i = 0; i < sides.size(); i++) {
            System.out.printf("%d. %s %d \n",(i+1), sides.get(i).name, sides.get(i).price);
        }
    }

    public String sidechoice(int num) {
        Side side = sides.get(num-1);
        total += side.price;
        sideCart.add(side);
        return side.name;
    }

    public void sidecancel(int num) {
        System.out.println(sideCart.get(num-1).name + "이 취소되었습니다.");
        total -= sideCart.get(num-1).price;
        sideCart.remove(num-1);
    }

    public void sideCartprint() {
        for (int i = 0; i <sideCart.size(); i++) {
            System.out.println((i+1) + ". " + sideCart.get(i).name);
        }
    }

    //음료수 메서드
    public void drinkprint() {
        for (int i = 0; i < drinks.size(); i++) {
            System.out.printf("%d. %s %d \n",(i+1), drinks.get(i).name, drinks.get(i).price);
        }
    }

    public String drinkchoice(int num) {
        Drink drink = drinks.get(num-1);
        total += drink.price;
        drinkCart.add(drink);
        return drink.name;
    }

    public void drinkcancel(int num) {
        System.out.println(drinkCart.get(num-1).name + "이 취소되었습니다.");
        total -= drinkCart.get(num-1).price;
        drinkCart.remove(num-1);
    }

    public void drinkCartprint() {
        for (int i = 0; i <drinkCart.size(); i++) {
            System.out.println((i+1) + ". " + drinkCart.get(i).name);
        }
    }
}
