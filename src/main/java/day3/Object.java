package day3;

public class Object {
    public static void main(String[] args) {

        // 폴더 -> 배열
        // 폴더 -> 숫자, 문자 가리지 않고 다 저장 가능한 개념 ==> 객체

        // int[] hong = {20, "홍길동", "서울"}; // 배열로는 안됨.

//        Person c; // 폴더가 만들어졌는가? X
        Person hong = new Person(); // Person 설계도에 따라서 객체를 하나 만들어줘. 그리고 c 변수에 담아줘 -> 객체를 생성할 때마다 새로운 복사본 생성
        Person lee = new Person();

        // 객체, 클래스
        hong.age = 20;
        hong.name = "홍길동";
        hong.home = "서울";

        // 사람을 표현하는 방법은 무한가지.
        // 자바는 변수 저장할 때 자료형을 요구
        // 객체는 먼저 어떻게 생겼는지 정의되어야 자바가 만들어줄 수 있다. -> 설계도(class)를 먼저 만든다.
        //


        lee.age = 30;
        lee.name = "이순신";
        lee.home = "대전";

        System.out.println(hong.age + "살, " + hong.home + "사는 " + hong.name + "입니다.");
        System.out.println(lee.age + "살, " + lee.home+ "사는 " + lee.name + "입니다.");



    }
}
