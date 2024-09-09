package project.appTest;

import java.util.Scanner;

public class PageTset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int currentpage = 1;
        int totalpage = 11;
        int pageSlot = 5;


        while (true) {
            int pageSlotStart = ((currentpage - 1) / pageSlot) * pageSlot + 1;
            int pageSlotEnd = Math.min(pageSlotStart + 4, totalpage);
            for (int i = pageSlotStart; i <= pageSlotEnd; i++) {
                if (currentpage == i) {
                    System.out.print("[" + i + "] ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println(">>");
            System.out.print("페이징 명령어를 입력해주세요 (1. 이전, 2. 다음, 3. 선택, 4. 뒤로가기) : ");
            int pagecommand = Integer.parseInt(sc.nextLine());
            if (pagecommand == 1) {
                if (totalpage >= currentpage) {
                    currentpage--;
                }
                if (currentpage == 0) {
                    System.out.println("더이상 페이지가 없습니다.");
                    break;
                }
            } else if (pagecommand == 2) {
                if (totalpage >= currentpage) {
                    currentpage++;
                }
                if (totalpage < currentpage) {
                    System.out.println("더이상 페이지가 없습니다.");
                    break;
                }
            } else if (pagecommand == 3) {
                System.out.print("이동하실 페이지 번호를 입력해주세요 : ");
                int pagenum = Integer.parseInt(sc.nextLine());
                if (totalpage < pagenum) {
                    System.out.println("페이지가 없습니다.");
                } else {
                    currentpage = pagenum;
                }

            } else if (pagecommand == 4) {
                break;
            }
        }
    }
}
