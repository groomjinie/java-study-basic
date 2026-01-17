package day5;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] scores = new int[100];//100명 점수 저장 가능
//        //합계 계산도 간단
          //======얕은복사 =====
          //b[0]를 바꾸면 > a[0]도 같이 바뀌면 얕은 복사
//        int sum = 0;
//        for (int i = 0; i < scores.length; i++) {
          int[] a={1,2,3};
          int[] b=a;
        //수정 전 출력//
        System.out.println(Arrays.toString(a));//1,2,3
        System.out.println(Arrays.toString(b));//1,2,3

        //b를 수정
        b[0]=99;
        System.out.println(Arrays.toString(a)); //99.2,3
        System.out.println(Arrays.toString(b)); //99.2,3

        //b를 바꿨는데 a도 같이 바뀌면 -> 얕은 복사

        //수정 후 출력

//          for(int i=0; i<a.length; i++){
//              System.out.println("a[" + i + "] = " + a[i]);

        //==============깊은복사=================
        // 깊은 복사는 객체 내부의 모든 참조 객체까지 새로 생성
        //원본가 복사본이 완전 별개
        int[] c={1,2,3};
        int[] d=a.clone();//깊은 복사
        //수정 전 출력
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(c));

        //d를 수정
        d[0] = 99;

        //수정 후 출력
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

      }
    }

////int 배열에는 int string 배열에는 string만 저장 가능
////배열 선언 방법 1. 대괄호를 타입 뒤에 권장
//int[]numbers;
//String[]names;
//double[]price;
//
////방법2 대괄호를 변수뒤예
//int score[];
//String fruits[];
//
////배열생성 (new 키워드)
////선언 후 생성
//int[]numbers;
//numbers = new int[5]; //크기가 5인 int 배열 생성
//
////선언과 생성을 동시에 (일반적)
//int[]scores = new int [10];
//String []names = new String[3];
//double []prices = new double[100];
//
////2-3. 배열 초기화
////방법 1 : 선언 +생성+초기화(한번에)
//int[]scores ={90,85,88,92,78} //크기 5, 값 지정
//String []fruits ="사과","바나나","딸기"}
//boolean[]flags={true,false,true};
//
////방법 2 선언 +생성 후 개별 쵝화
//int[] numbers = new int[3];
//numbers[0]=10;
//numbers[1]=20;
//numbers[2]=30;
//
////방법 3 : New 와 함께 초기화 (변수에 나중에 할당할 때)
//int[] data;
//data = new int[]{1.2.3.4.5};
//
////메서드 인자로 전달할 때
//printArray(new int[]{10,20,30});
////나중에 할당할때는 new int[]{1,2,3} 형태로
//
////인덱스 = 배열 요소의 위치번호 (0부터 시작)
//int[] arr = {10,20,30,40,50};
////인덱스는 0부터 시작 !/마지막 인덱스 길이는 -1
//
//
//int[] a = {1, 2, 3};
//int[] b = a;

