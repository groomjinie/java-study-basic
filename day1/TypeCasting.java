package day1;

public class TypeCasting {
    public static void main(String[] args) {
        //자동 형변환 (widening casting)====
        System.out.println("==자동 형변환===");
        int intNum = 100;
        long longNum = intNum;
        float floatNum = longNum;
        double doubleNum = floatNum;
        System.out.println("int:"+intNum);
        System.out.println("long"+longNum);
        System.out.println("float"+floatNum);
        System.out.println("double"+doubleNum);
        // 강제 형 변환 (Narrow Casting) ===
        System.out.println("\n==강제 형 변환=="); //\n 강제 줄바꿈
        double pi =3.14159;
        int intpi = (int)pi;//소수점 버림
        System.out.println("double pi:"+pi);
        System.out.println("int pi:"+intpi);

        int bigNumber =1000;
        byte smallNumber = (byte)bigNumber; // 오버플로우 발생 (최소값 표시)
        System.out.println("int:"+bigNumber);// byte 286인데, 128 ~ 255 이네 음수 표시 232 - 286 = =24
        System.out.println("byte;"+smallNumber);

        //char와 int의 변환
        System.out.println("\n===char와 int의 변환");
        char ch ='A';
        int ascii= ch;
        System.out.println("'A의 ascii;"+ascii);

        int code = 66;
        char letter =(char)code;
        System.out.println("66의 문자;"+letter);







    }
}
