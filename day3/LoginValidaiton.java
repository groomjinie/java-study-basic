package day3;

public class LoginValidaiton {
    public static void main(String[] args) {
        //입력값과 정답
        String inputId = "admin";
        String inputPassword = "admin1234!!";

        String correctId = "admin";
        String correctPassword = "admin1234!";
        //방법 1 중첩 if (세부 오류 메세지)
        System.out.println("====방법1 : 중첩 if");
        if (inputId.equals(correctId)) {//아이디와
            if (inputPassword.equals(correctPassword)) {//비번 같으면 성공
                System.out.println("🥳로그인 성공");
                System.out.println("환영합니다" + inputId + "님!");
            } else {//비번 불일치
                System.out.println("⚠️비밀번호가 일치하지 않아요");
                System.out.println("비밀번호를 정확히 입력해 주세요🫡");
            }
        } else {//존재하지 않는 회원 id
            System.out.println("존재하지 않는 아이디입니다.");
            System.out.println("회원가입을 진행해 주세요");
        }
        //방법 2 논리 연산자 (간단한 검증)
        int attempts = 2;
        System.out.println("\n===방법2 논리 연산자====");
        //boolean을 쓴다면 의미가 한눈에 보임 / 결과를 재사용/ 조건이 길다
        boolean isLoginSuccess =
                inputId.equals(correctId) &&
                inputPassword.equals(correctPassword);
        //방법 2 논리연산자 // 한번만 검사
        if (isLoginSuccess) {
            System.out.println("🥳로그인 성공");
        } else {
            attempts++;
            System.out.println("로그인 시도 " + attempts + "회 실패");
        }
    }
}
//        if (inputId.equals(correctId) && inputPassword.equals(correctPassword)) {
//            System.out.println("🥳로그인 성공");
//        } else {
//            attempts++;
//            System.out.println("⚠️로그인 실패");
//        }
//추가 로그인 횟수제한
//        System.out.println("\n===추가 : 로그인 횟수제한==");
/// /            int attempts = 0;
//        if (attempts >= 5) {
//            System.out.println("🔓계정이 잠겼어요 어드민 관리자에게 문의해 주세요.");
//        } else if (attempts >= 3) {
//            System.out.println("2회 더 실패하면 계정이 잠깁니다.");
//        } else {
//            System.out.println(" 로그인 시도 " + attempts + "회 실패");

//        if (inputId.equals(correctId) && inputPassword.equals(correctPassword)) {
//            System.out.println("🥳로그인 성공");
//        } else {
//            attempts++;
//            System.out.println("로그인 시도 " + attempts + "회 실패");
//        }
