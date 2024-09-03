package project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProjectClass pc = new ProjectClass();

        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                pc.setTitlelist(title);

                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                pc.setContentlist(content);

                System.out.println("게시물이 등록되었습니다.");
            } else if (command.equals("list")) {
                pc.listprint();
                System.out.println("===========================");
            } else if (command.equals("update")) {
                pc.Titlelist();
                System.out.print("수정할 게시물 번호 : ");
                int num = Integer.parseInt(sc.nextLine());
                pc.getTitle(num);
                System.out.print("제목 : ");
                String newtitle = sc.nextLine();
                System.out.print("내용 : ");
                String newcontent = sc.nextLine();
                pc.setTitlelist(num, newtitle);
                pc.setContentlist(num, newcontent);
                System.out.println(num + "번 게시물이 수정되었습니다.");
                pc.Titlelist();
            } else if (command.equals("delete")) {
                pc.Titlelist();
                System.out.print("삭제할 게시물 번호 : ");
                int num = Integer.parseInt(sc.nextLine());

            }
        }
    }

}
