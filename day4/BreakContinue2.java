package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BreakContinue2 {

    static class Task {
        String title;
        boolean done;

        Task(String title) {
            this.title = title;
            this.done = false;
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();

        //매일 해야할 일 초기화
        tasks.add(new Task("📚java 공부하기"));
        tasks.add(new Task("💪운동하기"));
        tasks.add(new Task("🚶‍♂️산책하기"));

        while (true) {

            //아직 완료되지 않은 일이 있는지 확인
            boolean hasTodo =false;
            for(Task task: tasks){
                if(!task.done){
                    hasTodo=true;
                    break;
                }
            }

            //할 일이 하나도 없으면 자동 종료
            if(!hasTodo){
                System.out.println("오늘도 수고했어! ❤️");
                break;
            }




            //1) 오늘 할일 출력 (완료된 건 제외)
            //====완료된 항목은 다음 반복으로 넘어감,완료된 할일은 출력되지
            //==하는 역할
            System.out.println("\n=== 🐬오늘 할 일 ====");
            for (Task task : tasks) {
                if (task.done) continue;//완료된 항목은 건너뜀
                System.out.println(task.title);
            }

            //2)완료한 항목 출력
            System.out.println("\n ===✅완료한 일 =====");
            for (Task task : tasks) {
                if (!task.done) continue;//완료 안된 건 건너뜀
                System.out.println(task.title);
            }
            //3) 사용자 입력
            System.out.println("\n 완료한 할일 을 입력하세요 (종료는 exit):");
            String input = SC.nextLine();


            //4)종료조건
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("오늘도 수고했어❤️");
                break; //while 종료 // 할일이 완료되면 break
            }
            //5)입력한 할일을 완료 처리
            boolean found = false;
            for (Task task : tasks) {
                if (task.title.equals(input)) {
                    task.done = true;
                    found = true;
                    System.out.println("완료 처리:" + input);
                    break;//할일 찾는 반복문 찾으면 반복 완료
                }
            }

            if (!found) {
                System.out.println("목록에 없는 할 일이야");
            }
        }
        SC.close();
    }
}
