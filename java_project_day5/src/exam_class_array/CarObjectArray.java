package exam_class_array;

public class CarObjectArray {
    public static void main(String[] args) {
        Car c1, c2, c3, c4, c5; //객체 선언
        c1 = new Car();
        c2 = new Car();
        c3 = new Car();
        c4 = new Car();
        c5 = new Car();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());

//        final int NUM_CARS = 5; //상수선언
//        Car [] cars = new Car[NUM_CARS];
//
//        for (int i = 0; i < cars.length; i++) {
//            cars[i] = new Car();//객체 생성
//        }
        Car[] cars = new Car[]{
                new Car(60,1,"검정색"),
                new Car(90,3,"회색"),
                new Car(0,1,"black"),
                new Car(10,2,"Green"),
                new Car(70,2,"red")   // 배열 선언 동시 초기화 ( new Car 생략 가능)
        };
        for (int i = 0; i < cars.length; i++) {
            cars[i].speedUp(); //메서드 호출
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println("자동차("+(i+1)+")"+
                    cars[i].toString());//필드출력
        }
    }
}
