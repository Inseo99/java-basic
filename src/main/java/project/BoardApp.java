package project;

import day1.Condition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BoardApp {

    //main 메서드와 findPostById 메서드가 같이 사용해야 하므로 main 밖으로 빼주고 static 붙여줌
    private Scanner sc = new Scanner(System.in);
    private PostController postController;
    private UserController userController = new UserController();

    public BoardApp() {
        postController = new PostController(userController);
    }

    public void run() {
        while (true) {
            if (userController.currentUser != null) {
                System.out.print("명령어를 입력해주세요.[");
                System.out.print(userController.currentUser.getID() + "(" + userController.currentUser.getName() + ")");
                System.out.print("] : ");
            } else if (userController.currentUser == null) {
                System.out.print("명령어를 입력해주세요. : ");
            }

            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                postController.add();
            } else if (command.equals("list")) {
                postController.list();
            } else if (command.equals("update")) {
                postController.update();
            } else if (command.equals("delete")) {
                postController.delete();
            } else if (command.equals("detail")) {
                postController.detail();
            } else if (command.equals("search")) {
                postController.search();
            } else if (command.equals("signup")) {
                userController.signup();
            } else if (command.equals("login")) {
                userController.login();
            } else if (command.equals("sort")) {
                postController.sort();
            } else if (command.equals("page")) {
                postController.page();
            }
        }
    }


}
