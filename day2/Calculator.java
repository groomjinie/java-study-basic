package day2;

public class Calculator {
    public static void main(String[] args) {
        int num1 =20;
        int num2 = 7;
        System.out.println("===기본 계산기");
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
        System.out.println(num1+"%"+num2+"="+(num1%num2));
        //실수나눗셈
        System.out.println("====\n 실수 나눗셈===");
        System.out.println(num1+"/"+num2+"="+((double)num1/num2));
        //증감연산자
        System.out.println("\n==증감 연산자;===");
        int x = 10;
        System.out.println("초기값"+x);
        System.out.println("x++"+x++);// 10출력후 증가
        System.out.println("현재x;"+x);//11
        System.out.println("++x;"+ ++x);//증가후 12출력
        //x++ : “지금 값 쓰고, 나중에 +1”
        //++x : “먼저 +1 하고, 그 값 씀”
    }
}
