package day6;

public class BankTest {
    public static void main(String[] args) {
        //1. 계좌생성
        BankAccount account1 = new BankAccount("이지니","111-222-333");
        BankAccount account2 = new BankAccount("김철수","444-555-666");

        //2. 입금
        account1.deposit(50000);//이지니 계좌에 5만원 입금
        account2.deposit(30000);//김철수 계좌에 3만원 입금

        //3.이체
        account1.transfer(account2,20000);//이지니가 김철수에게 2만원 이체

        //4.잘못된 이체 시도
        account2.transfer(account1,50000); //잔액부족

        //5.계좌정보출력
        System.out.println("\n ---최종 계좌 정보----");
        account1.showInfo();
        account2.showInfo();

    }

}
