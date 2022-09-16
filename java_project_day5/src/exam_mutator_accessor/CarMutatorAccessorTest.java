package exam_mutator_accessor;

public class CarMutatorAccessorTest {
    public static void main(String[] args) {
        CarMutatorAccessor myCar = new CarMutatorAccessor();

        //설정자 메소드 호출
        myCar.setColor("red");
        myCar.setSpeed(800);
        myCar.setGear(1);

        System.out.println("접근자 메서드 호출로 필드 출력");
        System.out.println("현재 자동차 색상 :"+ myCar.getColor());
        System.out.println("현재 자동차 속도 :"+ myCar.getSpeed());
        System.out.println("현재 자동차 기어 :"+ myCar.getGear());
        System.out.println();
        System.out.println("toString()메서드로 전체 필드 출력");
        System.out.println(myCar.toString());
    }
}
