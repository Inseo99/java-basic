package day6.constructor;

public class Person {
    int age;
    String name;

    // 리턴타입 X, class명과 동일한 이름의 특수한 메서드 ==> 생성자
    // 객체가 new로 생성되면 생성자는 무조건 실행된다.
//    public Person(String name, int age) {
//        System.out.println("사람이 한명 태어납니다.");
//        this.name = name; // this는 메서드를 수행하는 객체를 의미한다.
//        this.age = age;
//    }
        public Person() {
        System.out.println("사람이 한명 태어납니다.");
    }

    public void introduce() {
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
    }




}
