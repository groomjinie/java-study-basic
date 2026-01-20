package day6;

public class Car { // 설계도
    //1.필드(속성)
    String brand; //브랜드
    String model; //모델명
    int speed; //현재 속도

    //2.생성자
    public Car(String brand, String model){
        this.brand =brand;
        this.model = model;
        this.speed = 0;//초기 속도는 0
    }
    //3. 매서드
    //가속
    public void accelerate(int amount) {//메서드가 행동할때 얼마만큼 가속할지 알려줄께
        speed += amount;
        System.out.println(brand + "" + model + ": 가속! 현재속도" + speed + "km/h");
    }
   //감속
    public void brake(int amount) {
        speed -= amount;
            System.out.println(brand + "" +model+":감속! 현재속도"+speed +"km/h");
        }
    //차량 정보 출력
    public void info(){
            System.out.println("브랜드:"+brand+",모델"+model+"속도:"+speed+"km/h");
        }
    }

