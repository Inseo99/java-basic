package day2;

public class Exam2 {
    public static void main(String[] args) {

        // 문제
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 문제
        // 배열의 모든 요소를 세번 출력해주세요.

        int[] arr1 = {1,2,3,4,5};
        int num = 3;

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }
        }

        // 문제
        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.

        int[] arr2 = {11, 22, 33, 44, 55};
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);
        }

        // 문제
        // 배열 안의 숫자들의 합을 구해주세요.
		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/
        int[] arr3 = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }

        System.out.println(sum);

    }
}
