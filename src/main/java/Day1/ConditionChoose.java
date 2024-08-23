package Day1;

public class ConditionChoose {
    public static void main(String[] args) {

        // 택일구조

        // 남녀 (양자택일)

        // 학적 (사자택일)

        // 성적 (오자택일)

        int age;
        age = 8;

        if (age <= 13) {
            System.out.println("초등학생");
        }
        else if (age <= 16) {
            System.out.println("중학생");
        }
        else if (age <= 19) {
            System.out.println("고등학생");
        }
        else {
            System.out.println("성인");
        }

        // 성적 출력

        int score;
        score = 90;

        // 점수가 90 ~ 100 : A
        // 점수가 80 ~ 89 : B
        // 점수가 70 ~ 79 : C
        // 점수가 60 ~ 69 : D
        // 점수가 60 미만 : E

        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }

    }
}
