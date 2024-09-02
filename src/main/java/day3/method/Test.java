package day3.method;

public class Test {

    int age;
    String name;

    public void test() {
        System.out.println("안녕하세요!!");
        System.out.println("저는 차태진입니다.");
        System.out.println("자바를 통해");
        System.out.println("프로그램을 만들어보아요.");
    }

    public void hi() {
        System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
    }

    public void bye() {
        System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }

    public void print(int num) {
        System.out.println(num);
    }

    public void introduce(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다.!");
        }
    }

    public void greeting1(int num) {
        if (num == 1) {
            System.out.println("안녕하세요");
        } else if (num == 2) {
            System.out.println("하이~");
        } else if (num == 3) {
            System.out.println("봉쥬");
        }

    }

    public void greeting2(int language, int count) {
        if (language == 1) {
            for (int i = 0; i < count; i++) {
                System.out.println("안녕하세요");
            }
        }
        if (language == 2) {
            for (int i = 0; i < count; i++) {
                System.out.println("하이~");
            }
        }
        if (language == 3) {
            for (int i = 0; i < count; i++) {
                System.out.println("봉쥬");
            }
        }
    }
}