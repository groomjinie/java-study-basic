package day4;

public class BasicLoop {
    public static void main(String[] args) {
        //1부터 10까지 출력(for)
        //💡반복문을 써야하는데, 시작값이 1부터 사작 끝값이 10이 되려면 1씩 증가
        //횟수 정확하니까 for문을 써야겠다 (cf 조건만 있으면 while문을 쓰자)
        System.out.println("====for문 (1~10)====");
        for (int i = 1; i <= 10; i++) //for(int i=시작값 조건;변화{}
            //시작값 1, 10까지니까 i<=10, 하나씩 증가 i++
            System.out.print(i + " ");

        //40부터 1까지 출력(while)
        //💡숫자가 여러개 나와야 하니 반복문을 써야겠다.
        //40에서부터 언제 끝날지 모르니까 while문을 써야겠다.
        System.out.println("\n\n ====while문 (40 ~1)===");
        int j = 40;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }


        //1~100까지 합계 계산
        System.out.println("\n\n 1~100 합계 ===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            }
        System.out.println("합계" + sum);

        //짝수의 합
        System.out.println("\n====1~100 짝수의합");
        int evenSum = 0;
        for (int i = 2; i <= 100; i += 2) {
            evenSum += i;
            }
            System.out.println("짝수 합" + evenSum);
        }
    }

