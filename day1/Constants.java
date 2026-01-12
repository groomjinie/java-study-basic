package day1;

import java.sql.SQLOutput;

public class Constants {
    public static void main(String[] args) {
        //선언
        final double PI =3.141592;
        final int MAX_STUDENTS=50;
        final String SCHOOL_NAME = "JAVA BOOT CAMP";

        System.out.println("학교:"+SCHOOL_NAME);
        System.out.println("최대 학생 수:"+MAX_STUDENTS);

        //원의 넓이 계산 =======
        double radius = 5.0;
        double area = PI*radius*radius;

        System.out.println("\n반지름"+radius+"원주율;"+area);

        // PI = 3.14;  // ❌ 컴파일 에러! 상수는 변경 불가
        //PI= 고정형이기 때문에, 상수로 선언
    }
}
