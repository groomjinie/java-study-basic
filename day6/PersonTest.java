package day6;

import org.w3c.dom.ls.LSOutput;

public class PersonTest {
    public static void main(String[] args) {
    //그 설계도를 실제로 써보는 실행 공간
        //객체 생성
        //메서드 호출
        //결과 확인
        //연습장, 실험실 같은 존재

    //1. 기본 생성자로 객체 생성
    Person p1 = new Person();
    p1.name ="이지니";
    p1.age =25;

    //2. 매개변수 생성자로 객체 생성
    Person p2 = new Person("김영희",30);
    Person p3 = new Person("이철수", 28, "개발자");

    //3. 메서드 호출
    System.out.println("=== 자기소개 ===");
        p1.introduce();
        System.out.println();
        p2.introduce();
        System.out.println();
        p3.introduce();

        System.out.println("\n=== 인사하기 ===");
        p1.greet(p2.name);//p1 객체가 greet()라는 메서드를 호출하고 그 메서드에 p2.name (즉, "김영희")를 전달했다는 뜻이야
        //p1의 타입 -> person 그래서 Person클래스에 정의된 메서드 // 여기서 ctrl키 누르고 greet 선택 시 이동
    }
}


//실무에서는 chat gpt
//객체가 할 수 있는 일 → 그 클래스/객체 여러 개를 조율 → service
//실행 / 입력 / 출력 → main(app)
//연습 / 검증 → test