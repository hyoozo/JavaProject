package exam_class_array;

public class Car {
    private int speed;
    private int gear;
    private String color;

    public Car(){
        speed = 80;
        gear = 1;
        color = "red";
    }
    public Car(int speed, int gear, String color){
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }
    public void speedUp(){
        speed += 10;
    }
    public String toString(){
        return "속도 : "+speed+" 기어 : "+gear+" 색상 : "+color;
    }
}
