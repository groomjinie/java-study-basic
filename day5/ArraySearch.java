package day5;

public class ArraySearch {
    public static void main(String[] args) {
        String[] students = {"홍길동", "김영희","이철수"};

        //특정 학생 찾기
        String target = "홍길동";
        int index = -1;

        for (int i =0; i<students.length;i++){
            if(students[i].equals(target)){
                index=i;
                break;
            }
        }
        System.out.println("====학생 검색====");
        if (index !=-1){
            System.out.println("✅" + target + "은/는" + (index + 1) + "번째 입니다.");
        }else{
            System.out.println("❌"+target+"을(를) 찾지 못했습니다.");
            //전체 목록 출력
            System.out.println("\n=====학생목록======");
            for(int i = 0; i<students.length; i++) {
                String marker = (i == index) ? " 👈" : "";
                System.out.println((i=1)+"."+students[i]+marker);
            }

        }

    }
}
