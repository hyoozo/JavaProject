package exam_class_basic;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

//        car.speed = 100000;
//        car.gear = 100;
//        car.color = "예쁜노랑이";
        car.carDat(50000,64,"파랑파랑한 파랭이~~");
        car.printData();
        car.speedDown(6000);
        car.printData(); //출력 방법 1
        car.speedUp(55);
//        System.out.println(car.toString()); //출력방법 2 리턴값이라서 출력코드 안에 써야함

        System.out.println();

        Car car2 = new Car();

//        car2.speed = 5000;
//        car2.gear = 300;
//        car2.color = "핑쿠핑쿠 핑쿠곰돌이 ";
        car2.carDat(1004,1,"핑쿠핑핑핑쿠");
        car2.speedUp(96);
        car2.printData();
            // Car class 메소드 불러온 것임
    }
}
