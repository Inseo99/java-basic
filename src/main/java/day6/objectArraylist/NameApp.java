package day6.objectArraylist;

// 명명 규칙
// 클래스명은 대문자로 시작
// 의미가 바뀔 때 대문자로 구분. 두 단어 이상의 조합으로 이름 지을 때 단어 의미가 바뀌면 바뀌는 단어의 앞문자를 대문자로.
// 카멜 표기법
// 함수나 변수는 소문자로 시작.
// 상수는 모두 대문자 띄어쓰기는 _

import java.util.ArrayList;
import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // 나이를 입력해주세요 : 24
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john, 24
        // ===================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // tomas가 명부에 저장되었습니다.
        // ....
        // ========================
        // 명령어 입력 : exit
        // 프로그램이 종료되었습니다.

        Scanner sc = new Scanner(System.in);

        // Arraylist 사용
//        ArrayList<String> namelist = new ArrayList<>();
//        ArrayList<Integer> agelist = new ArrayList<>();

       ArrayList<Person> person = new ArrayList<>();

        // 이름 짓는 고민 -> 대충 짓고 넘어가면 -> 큰일 난다.
        // 이름 짓는 고민 -> 많이 해도 괜찮음
        // 변수 -> 명사(저장하려는 값과 관계 있어야 함), 메서드(동작) -> 동사(동작하는 것과 관계있어야 함)

        while (true) {
            System.out.print("명령어 입력 : ");
            String commmand = sc.nextLine();

            if (commmand.equals("add")) {
                System.out.print("이름을 입력해주세요 : ");

                Person p1 = new Person();

                // Arraylist 사용
                String name = sc.nextLine();
                p1.name = name;

                System.out.print("나이를 입력해주세요 : ");
                int age = Integer.parseInt(sc.nextLine());
                p1.age= age;

                person.add(p1);

                System.out.println(name + "이(가) 명부에 저장되었습니다.");


            }
            if (commmand.equals("list")) {
                System.out.println("===== 이름 목록 =====");

                // Arraylist 사용
                for (int i = 0 ; i < person.size(); i++ ) {
                    System.out.println((i+1) + ". " + person.get(i).name + ", " + person.get(i).age);
                }

                System.out.println("====================");

            }
            if (commmand.equals("exit")) {
                break;
            }
            if (commmand.equals("help")) {
                System.out.println("add : 이름입력\n" + "list : 이름 목록 확인\n" + "exit : 종료" );
            }

        }
        System.out.println("프로그램이 종료되었습니다.");

    }
}
