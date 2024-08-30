package Day6.kiosk;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KioskOperation ko = new KioskOperation();

        System.out.println("햄버거 키오스크 v1");

        while (true) {
            System.out.println("1. 햄버거 선택");
            System.out.println("2. 사이드 선택");
            System.out.println("3. 음료수 선택");
            System.out.println("4. 메뉴 취소");
            System.out.println("5. 주문 하기");
            System.out.println("===== 주문 목록 =====");
            System.out.print("버거: [");
            for (int i = 0; i < ko.hambergerCart.size(); i++) {
                System.out.print(ko.hambergerCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.print("사이드: [");
            for (int i = 0; i < ko.sideCart.size(); i++) {
                System.out.print(ko.sideCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.print("음료수: [");
            for (int i = 0; i < ko.drinkCart.size(); i++) {
                System.out.print(ko.drinkCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.println("총금액: " + ko.total);
            System.out.print("무엇을 하시겠습니까 : ");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                System.out.println("=== 햄버거 목록 ===");
                ko.hambergerprint();

                System.out.print("어떤 버거를 고르시겠습니까 : ");
                int target = Integer.parseInt(sc.nextLine());
                String hamberger = ko.hambergerchoice(target);
                System.out.println(hamberger + "를 고르셨습니다.");
            } else if (menu == 2) {
                System.out.println("=== 사이드 목록 ===");
                ko.sideprint();
                System.out.print("어떤 사이드를 고르시겠습니까 : ");
                int target = Integer.parseInt(sc.nextLine());
                String side = ko.sidechoice(target);
                System.out.println(side + "를 고르셨습니다.");
            } else if (menu == 3) {
                System.out.println("=== 음료수 목록 ===");
                ko.drinkprint();
                System.out.print("어떤 음료수를 고르시겠습니까 : ");
                int target = Integer.parseInt(sc.nextLine());
                String drink = ko.drinkchoice(target);
                System.out.println(drink + "를 고르셨습니다.");
            } else if (menu == 4) {
                while (true) {
                    System.out.println("어떤 메뉴를 취소하겠습니까?");
                    System.out.println("1. 버거");
                    System.out.println("2. 사이드");
                    System.out.println("3. 음료수");
                    System.out.println("4. 종료");
                    System.out.print("선택 : ");
                    int cancel = Integer.parseInt(sc.nextLine());
                    if (cancel == 1) {
                        System.out.println("품목을 선택해주세요.");
                        ko.hambergerCartprint();
                        System.out.print("선택 : ");
                        int num = Integer.parseInt(sc.nextLine());
                        ko.hambergercancel(num);
                    } else if (cancel == 2) {
                        System.out.println("품목을 선택해주세요.");
                        ko.sideCartprint();
                        System.out.print("선택 : ");
                        int num = Integer.parseInt(sc.nextLine());
                        ko.sidecancel(num);
                    } else if (cancel == 3) {
                        System.out.println("품목을 선택해주세요.");
                        ko.drinkCartprint();
                        System.out.print("선택 : ");
                        int num = Integer.parseInt(sc.nextLine());
                        ko.drinkcancel(num);
                    } else if (cancel == 4) {
                        System.out.println("취소를 종료하였습니다.");
                        break;
                    } else {
                        System.out.println("잘못 선택하셨습니다.");
                        break;
                    }
                }
            } else if (menu == 5) {

            } else {
                System.out.println("잘못 선택하셨습니다.");
                continue;
            }
        }
    }
}
