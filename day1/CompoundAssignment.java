package day1;

public class CompoundAssignment {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("====복합 대입 연산자====");
        System.out.println("초기값+"+x);

        x+=5;
        System.out.println("x+=5:"+x); //x = x + 5; 15
        x-=3;
        System.out.println("x-=3:"+x);
        x*=2;
        System.out.println("x*=2"+x);
        x/=4;
        System.out.println("x/=4"+x);
        x%=4;
        System.out.println("x%=4"+x);

        //문자열 연결
        System.out.println("\n====문자열 연결====");
        String message ="Hello";
        message+=" ";
        message+="world";
        message+="!";
        System.out.println(message);

    }
}
//복합 대입 연산자
//자기자신을 대입해서 하는 연산자