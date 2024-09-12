package last;

import java.util.ArrayList;

public class ExceptionHandle {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("apple");
        arr.add("banan");
        arr.add("orange");

        try {
            System.out.println(arr.get(3)); // 예외 발생 코드
        } catch (IndexOutOfBoundsException e) {
            System.out.println("3번 인덱스는 없습니다.");
        }

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안돼요.");
        }

        try {
            System.out.println(arr.get(3));
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안돼요.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스를 벗어났습니다.");
        }

        try {
            System.out.println(arr.get(3));
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안돼요.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스를 벗어났습니다.");
        } finally {
            System.out.println("여기는 무조건 실행되고 끝남");
        }

        System.out.println("hihi");

        // try - catch를 최대한 사용 안하는게 좋다.
        // 몇가지 상황을 제외하고는 try - catch 사용안하고 if로 처리 다 가능함.
    }
}
