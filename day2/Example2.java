package day2;



//public class Example2 {
//    public static void main(String[] args) {
//        int  a= 10, b=3;
//        System.out.println("a+b ="+(a+b));
//        System.out.println("a-b="+(a-b));
//        System.out.println("a*b="+(a*b));
//        System.out.println("a/b="+(a/b));
//        System.out.println("a%b="+(a%b));
//    }
//}

//정수 나눗셈 (정수끼리 나누면 결과도 정수)
//public class Example2 {
//    public static void main(String[] args){
//        int x =10;
//        int y = 3;
//        System.out.println(x/y);//3예상
//        System.out.println(10/4); //2
//        System.out.println(7/2);  //3
//        //실수의 결과를 얻으려면 > 형변환 필요
//        System.out.println((double) x/y);
//        System.out.println(x/(double)y);
//        System.out.println((double)x/(double)y);
//
//        //하나만 double이어도 결과는 double
//        System.out.println(10.0/3);
//        System.out.println(10/3.0);
//
//        //2-3.나머지 연산자(%)
//        //나머지 연산자 = 나눈셈의 나머지를 반환
//        System.out.println(10%3); //1
//        System.out.println(10%5);//0
//        System.out.println(10%7);//3
//        System.out.println(5%10);//5
//    }
//}


//**w정리하면
//정수/ 정수 = 정수(소수점 버림)
//실수가 포함되면  = 실수


//public class Example2 {
//    public static void main(String[] args) {
//        int num = 17; //num에 17 저장
//        if (num % 2 == 0) { //2를 나눈 나머지가 0이면 짝수) 나머지 1이므로 홀수
//            System.out.println("짝수");//조건이 참일때 실행
//        } else {
//            System.out.println("홀수");//조건이 거짓일때 실행
//        }
//    }
//}

////2.배수판별
//public class Example2 {
//    public static void main(String[] args) {
//        int n =15;
//        if(n%3==0){ //15를 3으로 나눈 나머지는 0이다 조건 ==0참
//            System.out.println(n+"은 3의 배수");
//            if(n%5==0){
//                System.out.println(n+"은 5의 배수");
//            }
//        }
//        //int를 16으로 바꾸면 결과값이 출력되지 않음
//    }
//}

////3. 자릿수 추출
//public class Example2 {
//    public static void main(String[] args) {
//        int number=12345;
//        int ones = number%10;
//        int tens= (number/10)%10;
//        int hundreds=(number/100)%10;
//        System.out.println("1의자리"+ones);
//        System.out.println("10의자리"+tens);
//        System.out.println("100의자리"+hundreds);
//
//    }
//}

//4.순환(cycle)
//public class Example2 {
//   public static void main(String[] args) {
//       for(int i =0; i<10;i++){
//           System.out.println(i%3+"");
//       }
//   }
//}
//i = 0부터 시작
//i < 10 인 동안 반복
//한 번 돌 때마다 i++ (1씩 증가)
//0123456789 i%3 012012 반복 ""공백

//리스트에서 카드 색상 패턴 반복
//public static void main(String[] args) {
//    for(int i=0;i< items.size();i++){
//        if(i%2==0) {
//            setBackground("white");
//        }else{
//            setBackground("gray");
//        }
//    }
//}

//3명 플레이어 턴순환
public class Example2 {
    public static void main(String[] args) {
        String[] players = {"A","B","C"};

        for (int turn = 0; turn < 10; turn++) {
            System.out.println("턴 " + players[turn % 3]);
        }
    }
}
