package day3;

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

        // Array 사용
//        String[] namelist = new String[0]; // null

        // Arraylist 사용
        ArrayList<String> namelist = new ArrayList<>();
        ArrayList<Integer> agelist = new ArrayList<>();

        while (true) {
            System.out.print("명령어 입력 : ");
            String commmand = sc.nextLine();

            if (commmand.equals("add")) {
                System.out.print("이름을 입력해주세요 : ");

                // Array 사용
//                String[] names = new String[namelist.length + 1];
//                String name = sc.nextLine();
//
//                for (int i = 0; i < namelist.length; i++) {
//                    names[i] = namelist[i];
//                }
//
//                names[names.length-1] = name;
//
//                namelist = names;


                // Arraylist 사용
                String name = sc.nextLine();
                namelist.add(name);

                System.out.print("나이를 입력해주세요 : ");
                int age = sc.nextInt();
                agelist.add(age);

                sc.nextLine();

                System.out.println(name + "이(가) 명부에 저장되었습니다.");


            }
            if (commmand.equals("list")) {
                System.out.println("===== 이름 목록 =====");

                // Array 사용
//                for (int i = 0 ; i < namelist.length; i++ ) {
//                    System.out.println((i+1) + ". " + namelist[i]);
//                }

                // Arraylist 사용
                for (int i = 0 ; i < namelist.size(); i++ ) {
                    System.out.println((i+1) + ". " + namelist.get(i) + ", " + agelist.get(i));
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
