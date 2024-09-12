package projectExam2;

import java.util.Scanner;

public class UserController {
    private Scanner sc = new Scanner(System.in);
    private UserRepository userRepository = new UserRepository();

    public void signup() {
        System.out.println("==== 회원 가입을 진행합니다 ====");
        System.out.print("아이디를 입력해주세요 : ");
        String userId = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요 : ");
        String userPW = sc.nextLine();
        System.out.print("닉네임을 입력해주세요 : ");
        String username = sc.nextLine();

        User user = new User(userId, userPW, username);
        userRepository.userSave(user);

        System.out.println("==== 회원가입이 완료되었습니다. ====");
    }
}
