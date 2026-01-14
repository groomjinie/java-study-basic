package day3;

import java.sql.SQLOutput;

public class SeasonChecker {
    public static void main(String[] args) {
        int month = 11;
        String Season;
        String activity;

        //switch문으로 계절판다 (fall-through 활용)
        switch (month) {
            case 3:
            case 4:
            case 5:
                Season = "spring 🌸";
                activity = "벚꽃놀이가요";
                break;

            case 6:
            case 7:
            case 8:
                Season = "Summer 🐬";
                activity = "아쿠아리움을 가요";
                break;

            case 9:
            case 10:
            case 11:
                Season = "fall🍁";
                activity = "단풍구경을 가요";
                break;
            case 12:
            case 1:
            case 2:
                Season = "❄️winter";
                activity = "☃️눈사람을 만들어요";
                break;
            default:
                Season = "알수없음";
                activity = "올바른 월을 입력해 주세요.";
        }
        //결과 출력
        System.out.println("계절 판단 결과");
        System.out.println("입력한 월:" + month + "월");
        System.out.println("계절:" + Season);
        System.out.println("추천:" + activity);

        //추가 분기별 정보
        int quater;
        if (month >= 1 && month <= 3) {
            quater = 1;
        } else if (month >= 4 && month <= 6) {
            quater = 2;
        } else if (month >= 7 && month <= 9) {
            quater = 3;
        } else if (month >= 10 && month <= 12) {
            quater = 4;
        } else {
            quater = 0;
        }

        if (quater>0){
            System.out.println("\n🗓️"+ month +"월은 "+ quater +" 분기입니다.");


        }
    }
}


