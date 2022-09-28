package exam_interface;
/* 자바에서는 객체의 크기를 비교하는데 사용되는 Comparable 인터페이스를 제공해준다.
 */

import javax.swing.*;
@SuppressWarnings("rawtypes")   // 이 구문을 무시해도됩니다. 라는 표식
class Box implements Comparable{
    private double volume;

    public Box(double volume) {   //초기화함
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }


 /* pubilc interface Comparable{
 *      이 객체가 다른 객체보다 크면 1, 같으면0, 작으면 -1을 반환한다.
 *      int compareTo(Object other);
 * }
 */
    @Override    //compareTo 재정의 하는곳
    public int compareTo(Object obj) {   //Object obj = b2 업캐스팅
                        //매개변수타입을 (Object )로 주면 모든 객체를 확인할 수있다!!

        Box other = (Box) obj;  //(서브클래스명) 부모클래스의 참조변수. 다운캐스팅
                    //obj. 으로 하면 Object가 가지고있는 필드를 가져오니
                   // (Box)로 형변환 한거임.
        //if (b1.compareTo(b2) > 0)
        if (this.volume < other.volume) {
            return -1;
        } else if (this.volume > other.volume) {
            return 1;
        } else {
            return 0;
        }
    }
}
/* Box라는 이름으로 클래스를 생성하고 실수형으로 필드 (volume)를 하나 가진다.
   실행클래스를 생성하여 두개의 객체를 생성하여 두 객체의 필드 값을 비교하여 큰지 작은지를 판별하도록 작성.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box(100.4);
        Box b2 = new Box(85.0);
    //첫번째 방법 * 직접 값넣어서 비교한것임.
        if (b1.getVolume() > b2.getVolume()) {
            System.out.println("b1이 b2보다 더 크다.");
        } else {
            System.out.println("b1가 b2와 같거나 작다.");
        }
    //두번째 방법 * compareTo로 객체 자체로 비교할수있게 한거임
        if (b1.compareTo(b2) > 0) {
            //b1.이 가지고있는 볼륨
            System.out.println("b1이 b2보다 더 크다");  //이게 출력됨.
        } else {
            System.out.println("b1가 b2와 같거나 작다");
        }
    }
}
