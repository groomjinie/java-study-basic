package day3;

public class DayOfWeek {
    public static void main(String[] args) {
        int day =5;
        //switch문으로 요일출력
        String dayName;
        switch (day) {
            case 1:
                dayName = " 월요일 ";
                break;
            case 2:
                dayName = " 화요일 ";
                break;
            case 3:
                dayName = " 수요일 ";
                break;
            case 4:
                dayName = " 목요일 ";
                break;
            case 5:
                dayName = " 금요일 ";
                break;
            case 6:
                dayName = " 토요일 ";
                break;
            case 7:
                dayName = " 일요일 ";
                break;
            default:
                dayName = " 잘못된 입력 ";
        }

        System.out.println("오늘은"+dayName+"입니다");
        //평일 주말 판단 (if문)
        if (day>=1 && day<=5) { //day가 1 이상이고, 동시에 5 이하라면
            System.out.println("🌱🌱🌱🌱평일 입니다.깃헙에 잔디를 심어주세요🌱🌱🌱🌱");
        } else if (day==6 || day==7) {
            System.out.println("🥳🥳🥳🥳주말입니다.푹쉬세요😴🥳🥳🥳");
        }else {
            System.out.println("⚠️정확한 요일번호를 입력해주세요");

        }
    }
}
