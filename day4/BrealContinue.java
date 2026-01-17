package day4;

public class BrealContinue {
    public static void main(String[] args) {
        //break : 특정 값 찾기
        System.out.println("===break : 값 찾기 ====");
        int target= 7;

        for (int i =1; i <=10; i++){
            if(i==target){
                System.out.println("🎯"+ target+"찾음! 종료");
                break;
            }
            System.out.println("검색 중 :"+i);
        }
        //continue : 짝수만 출력
        System.out.println("\n===continue : 짝수만===");
        for (int i =1; i<= 10; i++){
            if( i%2!=0)continue; //홀수 건너뜀
            System.out.println(i+" ");
        }
        //continue : 3의 배수 제외
        System.out.println("\n=====continue : 3의 배수 제외 =====");
        for (int i =1; i <=15; i ++){
            if(i%3==0) continue;
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

//💡break : 반복문을 즉시 종료시키는 키워드
//특정 조건이 되면 반복문을 끝낸다. break뒤의 반복문은 더 이상 실행되지 않음
//조건 만족하면 더 이상 반복할 필요가 없을 때
//🎯중복 검사를 빠르게 끝내기🎯
//for (User u : users) {
//        if (u.getEmail().equals(email)) {
//        System.out.println("이미 존재하는 이메일");
//        break;
//                }
//                }
//🎯로그에서 특정 이벤트 찾기🎯에러로그,
//for (Log log : logs) {
//    if (log.isError()) {
//        System.out.println("에러 발견");
//        break;
//    }
//}
//🎯할일 앱에서 특정조건이면 반복종료(break)🎯
//public void completeTask(int id) {
//    for (Task task : tasks) {
//        if (task.getId() == id) {
//            task.setDone(true);
//            break;
//        }
//    }
//}


//💡continue : 현재 반복만 건너뜀 -> 다음 반복으로 이동
//필요겂는 값만 제외하고 싶을 때 , 데이터 필터링 할때
//🎯🎯회원가입 유효성 검사🎯🎯
//for (String input : inputs) {
//    if (input.isEmpty()) continue; // 빈 값은 무시
//
//    // 실제 처리 로직
//    validate(input);
//🎯할일 목록(완료된 task) 제외
//public void printTasks() {
//    for (Task task : tasks) {
//        if (task.isDone()) continue;
//        System.out.println(task.getId() + ". " + task.getTitle());
//    }
//}
