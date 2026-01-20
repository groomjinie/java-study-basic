package day6;

public class CarTest {
        public static void main(String[] args) {
            //1.객체 생성
            Car myCar = new Car("현대","소나타"); //my car 객체 , brand, model =>필드
            Car yourCar = new Car ("기아", "K5");

            //2. myCar 테스트
            myCar.info(); // 초기 상태 확인 //자동차의 현재 상태를 출력하는 메서드
            myCar.accelerate(70); // accelerate(int amount) 메서드 //amount(매개변수)
            myCar.accelerate(30);//70+30 = 100이됨
            myCar.brake(20);//100-20=80

            System.out.println();

            //3.yourCar 테스트
            yourCar.accelerate(100);
            yourCar.info();

        }
    }
