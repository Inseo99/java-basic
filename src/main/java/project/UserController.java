package project;

import java.util.Scanner;

public class UserController {
    private Scanner sc = new Scanner(System.in);
    private UserRepository userRepository = new UserRepository();
    private Userview userview = new Userview();

    User currentUser = null;

    public UserController() {
        User u1 = new User("qwe1234", "asd1234", "김", false);
        User u2 = new User("zxc1234", "qwe1234", "홍", false);
        userRepository.save(u1);
        userRepository.save(u2);
    }

    public void login() {
        System.out.print("아이디 : ");
        String ID = sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.nextLine();

        User user = findUserById(ID);
        if (user == null || !user.getPassword().equals(password)) {
            System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
        }
        else {
            currentUser = user;
            System.out.println(currentUser.getName() + "님 환영합니다!");
        }
    }

    public void signup() {
        System.out.println("==== 회원 가입을 진행합니다. ====");
        System.out.print("아이디를 입력해주세요. : ");
        String ID = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요. : ");
        String password = sc.nextLine();
        System.out.print("닉네임을 입력해주세요 : ");
        String name = sc.nextLine();

        User user = new User(ID, password, name, false);
        userRepository.getUsers().add(user);

        System.out.println("==== 회원가입이 완료되었습니다. ====");
    }

    public User findUserById(String id) {
        for (User user : userRepository.getUsers()) {
            if (user.getID().equals(id)) {
                return user; // return을 만나면 메서드는 그 즉시 종료
            }
        }
        return null; // null은 없다라는 의미
    }

    public String loginWhether() {
        if (currentUser != null) {
            return currentUser.getName();
        } else return "비로그인 유저";
    }

}
