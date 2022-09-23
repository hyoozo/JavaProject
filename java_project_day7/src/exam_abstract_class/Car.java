package exam_abstract_class;
/*
Car 클래스를 생성하여 drive() 와 stop()추상 메서드와 3개의 메서드 startCar(), turnOff(), run()을 가진다.
자동차 시동을 켜도 끄는 방법은 어느 차나 동일하다.
그래서 startCar(), turnOff()는 미리 코드를 정의해 둔다.
run()메서드는 다른 클래스에서 오버라이딩이 불가능하게 선언하고 위의 모든 메서드를 호출할 수 있도록 정의한다.
Car를 상속받는 두 클래스는 자율 주행 자동차(AICar)와 일반 자동차(Manualcar)이다.
 */
public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    public final void run(){
        startCar();
        drive();
        stop();    //추상필드를 자식 클래스에 재정의 하고 run을 호출하였을때 재정의 한 값이 함께 출력됨.
        turnOff();
    }
}
