package day2;

public class ConditionCheck {
    public static void main(String[] args) {
        int age = 25;
        int score =85;
        //======비교 연산 ====
        System.out.println("===비교연산===");
        System.out.println("성인여부 (age>=18);"+ (age>=18));
        System.out.println("합격여부(score>=60);"+(score>=60));
        //  비교연산자는 ture/ faluse 로 출력
        //논리연산
        System.out.println("\n====논리연산=====");
        boolean canApply =(age >=20)&& (score>=70);
        System.out.println("지원가능 (20세 이상 and 70점 이상);"+canApply);

        boolean getDiscout =(age<20) || (age >=65);
        System.out.println("할인대상 (20세 미만 or 65세 이상):"+getDiscout);

        //삼항 연산자
        System.out.println("\n===삼항 연산자====");
        String result = (score>=60) ?"합격":"불합격";
        System.out.println("결과:"+result);

        //중첩 삼항 연산자(학점계산)
        char grade =(score>=90)?'A':
                    (score >=80)?'B':
                    (score >=70)?'C':
                    (score >=60)?'D': 'F';
        System.out.println("학점"+grade);
    }
}
//
//💬 실무 팁 (진짜 중요)
//단순 조건 → 삼항 연산자 👍
//조건 많아지면 → if / else if 👍👍
//(가독성이 훨씬 중요)