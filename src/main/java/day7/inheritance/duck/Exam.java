package day7.inheritance.duck;

public class Exam {
    public static void main(String[] args) {
        /* 가정
        우리는 게임개발회사에 입사했다.
        우리에게는 성격좋은 사수 한명이 있다.
        내가 개발할 게임은 오리시뮬레이션 게임이다.
        선임이 나의 개발을 도와주진 않지만 조언은 해준다.
        */

        /* 요구사항
        - D1 요구 : 오리를 생성하고 날게하시오.
        - D1 완료 : 클래스와 메서드를 만들어서 처리
        - D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
        - D2 완료 : 클래스와 메서드를 만들어서 처리
        - D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
        - D3 완료 : 상속을 사용해서 처리
        - D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
        - D4 완료 : 클래스와 메서드를 만들어서 처리
        - D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
        - D5 완료 : 메서드 오버라이드를 사용해서 처리
        - D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
        - D7 요구 : 새로운 기능인 헤엄치기를 추가하고 오리처럼 날고 고무오리처럼 헤엄치는 아수라 오리를 추가해주세요.
        */
        MallardDuck md1 = new MallardDuck();
        md1.fly();
        md1.swim();

        WhiteDuck wd1 = new WhiteDuck();
        wd1.fly();
        wd1.swim();

        RebberDuck rd1 = new RebberDuck();
        rd1.fly();
        rd1.swim();
        RebberDuck rd2 = new RebberDuck();
        rd2.fly();
        rd2.swim();

        AsuraDuck ad1 = new AsuraDuck();
        ad1.fly();
        ad1.swim();
    }
}
