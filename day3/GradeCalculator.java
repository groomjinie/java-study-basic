package day3;

public class GradeCalculator {
    public static void main(String[] args) {
        int score=40;
        char grade;
        String message;
        //if-eles  if-else로 학점 계산

        if(score>=90){
            grade='A';
            message = "🐬우수합니다!";}
        else if (score>=80){
            grade='B';
            message="☺️좋습니다!😘";}
        else if (score>=70) {
            grade='C';
            message="보통";}
        else if (score>=60) {
            grade='D';
            message="🥹노력필요";}
        else {
            grade='F';
            message="😱😱재수강이 필요😱😱";}

        //결과 출력
        System.out.println("성적결과표");
        System.out.println("점수:"+score+"점");
        System.out.println("학점:"+grade+"등급");
        System.out.println("코멘트"+message);
        }
    }

