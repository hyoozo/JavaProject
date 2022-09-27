package exam_interface;
/* 자바에서는 객체의 크기를 비교하는데 사용되는 Comparable 인터페이스를 제공해준다.
 * pubilc interface Comparable{
 *  //이 객체가 다른 객체보다 크면 1, 같으면0, 작으면 -1을 반환한다.
 * int compareTo(Object other);
 * }
 */

import javax.swing.*;

class Box implements Comparable{
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }

    @Override
    public int compareTo(Object o) {
        Box other = (Box) o;
        if (this.volume < other.volume) {
            return -1;
        } else if (this.volume > other.volume) {
            return 1;
        } else {
            return 0;
        }
    }
}
public class BoxTest {
    public static void main(String[] args) {
//        Box b1 = new Box(100,4);
        Box b2 = new Box(85.0);

//        if (b1.getVolume() > b2.getVolume()) {
//            System.out.println("b1이 b2보다 더 크다.");
//        } else {
//            System.out.println("b1가 b2와 같거나 작다.");
//        }
//
//        if (b1.compareTo(b2) > 0) {
//            System.out.println("b1이 b2보다 더 크다");
//        } else {
//            System.out.println("b1가 b2와 같거나 작다");
//        }
    }
}
