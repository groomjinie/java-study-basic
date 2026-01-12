package day1;

public class Product {
    public static void main(String[] args) {

        //====상수=====
        final double Tax_Rate = 0.1; //세금 10%

        //상수정보 ===
        String ProductName = "💻노트북";
        int price =250000;
        int quantity=2;
        boolean isAvailable= true;
        char category = 'E'; // E: 전자제품

        // ===계산===
        int totalPrice = price * quantity;
        double tax = totalPrice * Tax_Rate;
        double finalPrice = totalPrice + tax;
        //출력 =-====
        // System.out.println("==상품정보===");
        // System.out.println("상품명:"+ProductName);
       /* System.out.println("상품가격:"+price);
        System.out.println("수량:"+quantity);
        System.out.println("재고여부:"+isAvailable);
        System.out.println("카테고리:"+category);
        System.out.println("\n===결제정보===");
        System.out.println("상품금액:"+totalPrice);
        System.out.println("세금(10%);"+tax);
        System.out.println("최종금액;"+(int)finalPrice+"원");*/

        System.out.println("==📦상품정보===");
        System.out.println("상품명:"+ProductName);
        System.out.println("상품가격:"+String.format("%,d",price)+"원");
        System.out.println("수량:"+quantity);
        System.out.println("재고여부:"+isAvailable);
        System.out.println("카테고리:"+category);
        System.out.println("\n===💰결제정보===");
        System.out.println("상품금액:"+String.format("%,d",totalPrice)+"원");
        System.out.println("세금(10%):"+String.format("%,d",(int)tax)+"원");
        System.out.println("최종금액:"+String.format("%,d",(int)finalPrice)+"원");

    }
}


//🐬천의자리 콤마표시
// System.out.println("단가: " + String.format("%,d", price) + "원");
//System.out.println("상품 금액: " + String.format("%,d", totalPrice) + "원");
//System.out.println("세금 (10%): " + String.format("%,d", (int) tax) + "원");
//System.out.println("최종 금액: " + String.format("%,d", (int) finalPrice) + "원");