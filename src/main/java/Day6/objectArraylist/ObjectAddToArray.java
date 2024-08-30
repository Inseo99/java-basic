package Day6.objectArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectAddToArray {
    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        while(true) {
            System.out.println("이름 입력: ");
            String name = sc.nextLine();

            System.out.println("나이 입력: ");
            int age = Integer.parseInt(sc.nextLine());

            // 지역변수 => 특정 지역에서 만들어져서 지역이 끝나면 사라진다.
            Person p1 = new Person();
            p1.name = name;
            p1.age = age;

            persons.add(p1); // p1 변수가 사라지기 전에 p1 저장된 person 리모콘을 배열에 저장

        }
    }
}
