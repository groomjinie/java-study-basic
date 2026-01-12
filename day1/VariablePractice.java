package day1;

public class VariablePractice {
    public static void main(String[] args) {
        String name = "jinie";
        int age =17;
        double height =150.0;
        boolean isStudent = false;
        //논리 타입에 대한 값을 저장하는 변수 이름
        //~~ 입니까 물어보는 형태로
        //isStudent? hasValue? isSuccess? 이런형태로
        //컨밴션 형태로 쓰는 것 을 원함
        String grade="A+"; // 등급+을 하려면 String grade로 써야함
        System.out.println("==🫡학생 정보 ==");
        System.out.println("이름:"+name);//출력후 줄바꿈 출력
        System.out.println("나이:"+age);//출력후
        System.out.println("키:"+height);//출력후
        System.out.println("학생여부:"+isStudent);
        System.out.println("등급:"+grade);

        // 값 변경 ==
        age= 27;
        grade = "A++";
        System.out.println("\n ===10년후====");
        System.out.println("나이:"+age+"세");
        System.out.println("등급" +grade);

    }
}
//java document 에서 메서드를 찾아볼 수 있음

