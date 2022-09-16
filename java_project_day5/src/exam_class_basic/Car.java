package exam_class_basic;

public class Car {
    public int speed;
    public int gear;
    public String color;
    public void speedUp(int s) {
        speed += s;
    }
    public void speedDown(int s) {
        speed -= s;
    }
    public void printData() {
        System.out.println("속도: " + speed + " 기어: " + gear + " 컬러: " + color);
    }
    public String toString() {
        return "속도: " + speed + " 기어: " + gear + " 컬러: " + color;
//        객체의 상태를 문자열로 반환하는 메소드
    }
    public void carDat(int s, int j, String c){
        speed = s;
        gear = j;
        color = c;
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.speed = 100000;
        car.gear = 100;
        car.color = "예쁜노랑이";
        car.printData();
        car.speedDown(6000);
        car.printData(); //출력 방법 1
        car.speedUp(55);
//        System.out.println(car.toString()); //출력방법 2 리턴값이라서 출력코드 안에 써야함
        System.out.println();
        Car car2 = new Car();

        car2.speed = 5000;
        car2.gear = 300;
        car2.color = "핑쿠핑쿠";
        car2.speedUp(96);
        car2.printData();

        car = car2; //car2의 주소를 car에 대입한다는 뜻
        car.speed= 10;
        System.out.println(car2.speed);
    }
}