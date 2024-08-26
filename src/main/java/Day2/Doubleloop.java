package Day2;

public class Doubleloop {
    public static void main(String[] args) {
        // while, for

        //
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }


        // 구구단 2단 만들기

        for (int i = 1; i < 10; i++) {
            System.out.println("2 X " + i + " = "+ (2 * i));
        }

        // 구구단 만들기
        for (int j = 1; j < 10 ; j++) {
            System.out.println("구구단 " + j + "단");
            for (int i = 1; i < 10; i++) {
                System.out.println(j + " X " + i + " = "+ (j * i));
            }
        }



    }
}
