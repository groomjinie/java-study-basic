package day7;

public class MethodBasic {
    public static void main(String[] args) {
        //메서드 호출
        greet();
        greet("김지닝");

        //반환값 사용
        int sum = add(10,20);
        System.out.println("합계:"+sum);

        //직접 출력
        System.out.println("곱셈:"+multiply(5,6));
    }

        //매개변수 없음 반환값 없음
         public static void greet(){
             System.out.println("안녕하세요!"); //인사기능을 수행하는 메서드
         }

         //매개변수 있음, 반환값 없음(오버로딩)
         public static void greet(String name){ //name이라는 입력이 있으면 매개변수
             System.out.println("안녕하세요"+name+"님!");
         }

         //매개변수 있음, 반환값 있음
         public static int add(int a, int b){ //출력이 있으면 반환값
        return a+b;
         }

         public static int multiply(int a, int b){
           return a*b;
         }
    }

//main 실행
// ├─ greet() 호출 → "안녕하세요!" 출력
// └─ add(10,20) 호출 → 30 반환 → sum에 저장 → 출력
//메서드 실행할 기능을 모아둔 블록