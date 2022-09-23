package exam_abstract_class;
abstract class Shape{  // 추상클래스
    int x, y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void draw();
    //추상 메서드(메서드의 선언부분만 존재하고 정의 부분을 가지고 있지 않은 메서드
}
class Rectangle extends Shape{
    int width, height;
    public void draw(){
        System.out.println("사각형 그리기 메서드");
    }
}
class Circle extends Shape{
    int radius;
    public void draw(){
        System.out.println("원 그리기 메서드");
    }
}
public class AbstractShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
        //Shape s = new Shape(); 추상 클래스는 인스턴스 생성이 불가능 하다.
    }
}
