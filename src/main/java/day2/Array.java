package day2;

public class Array {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;
        int h = 80;

        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        System.out.println(e);

        // 변수가 많아지면 변수를 관리하는 것도 힘들고 사용하는 것도 힘들다.
        // 1. 변수명이 많아져서 힘듦   -> 변수명을 한개만 쓰면 됨.
        // 2. 변수가 많아져서 다 사용하기 힘듦    -> 반복문을 사용하면 됨.

        // 결론 : 배열을 사용하면 됨.

        int[] arr = { 20, 40, 30, 10, 50 };

        System.out.println(arr[3]);
        System.out.println(arr[0]);

        int num = 10;
        num = 20;

        System.out.println(arr[2]);
        System.out.println("===============================");
        arr [2] = 100; // 배열의 특정 위치의 값을 새로운 값으로 대입 가능.
        System.out.println(arr[2]);

        System.out.println("===============================");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("===============================");
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }

        // 숫자 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        // 배열에 저장하고 출력

        int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 배열의 길이 정보 확인
        System.out.println(arr1.length);


        // 내가 저장할 값이 몇개인지 모를 때, 개수를 알아도 구체적인 값을 모를 때
        // 비어있는 배열을 만들어 놓고 나중에 값을 저장할 수도 있어야 함.

        // 10개짜리 비어있는 배열을 만들기
        int[] arr2 = {0, 0, 0, 0, 0, 0, 0};
        int[] arr3 = new int[7]; // 비어있는 배열 만드는 방법


        System.out.println(arr2.length);
        System.out.println(arr3.length);

        // 중간에 값 저장
        arr3[4] = 10;

        // 숫자 배열 -> 숫자만 저장 가능. 다른 타입은 불가능.
        int[] arr4 = {1, 2, 3, 4, 5};
        String[] arr5 = {"apple", "banana", "orange"};
        boolean[] arr6 = {true, false, false, true};

    }
}
