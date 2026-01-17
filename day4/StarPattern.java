package day4;

public class StarPattern {
    public static void main(String[] args) {
        int n = 5; //크리스 마스 트리 높이
        int blocks=3; //트리 층수
//        //직각 삼각형
//        System.out.println("====직각 하트====");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("❤️");
//            }
//            System.out.println();
//        //역삼각형
//        System.out.println("\n====역돌고래====");
//        for (int k = n; k >= 1; k--) { //점점 줄어드려면 k-1
//            for (int j = 1; j <= k; j++) { //한줄 출력 반복 "j<=k"조거이 몇개 출력할지 결정
//                System.out.print("🐬");
//            }
//            System.out.println();

        //크리스마스 트리(피라미드형)
        //공백이 줄어들고 크리스 마스 오브먼트가 있다
        //첫줄 : 공백 n-1 개  /제일위에 별
        //두번째 줄 : 공백 n-2개 /오브먼트 3개 /오브먼트 5개 (2*i-1)
        System.out.println("\n====피라미드====");

        for(int block =1; block <= blocks; block++){ //block 층수)
        for (int i = 1; i <= n; i++) {
            //변수 1부터 시작하고, 총 n줄 출력될꺼에요, 반복될때마다 1씩 증가

            //공백 출력 (n-1)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            //별 출력
            if (block == 1 && i==1) {
                System.out.print("⭐️"); //포인트 별
            } else { //하단 피라미드 규칙❄️ 출력
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("❄️");
                }
            }
                System.out.println();
            }
        }
    }
}
