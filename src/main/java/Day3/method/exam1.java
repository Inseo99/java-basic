package Day3.method;

public class exam1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.name = "홍길동";
        t1.age = 20;

        t1.test();

        t1.hi(); // 안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.

        t1.bye(); // 안녕히 가세요. 다음에 또 봐요!

        t1.print(4);
        t1.print(10);
        t1.print(100);

//        t1.introduce();

        t1.introduce(3);
        System.out.println("==============================");
        t1.introduce(5);
        System.out.println("==============================");
        t1.introduce(10);

        t1.greeting1(2);
        t1.greeting1(3);
        t1.greeting1(1);

        t1.greeting2(1,3);
        t1.greeting2(2,5);
        t1.greeting2(3,7);

    }
}
