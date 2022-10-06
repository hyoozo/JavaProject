package exam_generic_type;
//제네릭 클래스 선언
class MyMath <T extends Number>{
    // T의 타입으로는 Number클래스(Number클래스 포함)의 하위클래스만 가능.
    double v = 0.0;
    public double getAverage(T[] a) {
        for (int i = 0; i < a.length; i++) {
            v = v + a[i].doubleValue();
        }
        return v/a.length;
    }
}
public class MyMathExample {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5,6};
        MyMath<Integer> m = new MyMath<>();  //Integer 클래스는 Number 클래스의 하위클래스
        System.out.println(m.getAverage(list));

        Double[] data = {6.9,9.2,5.3};      //Double 클래스는 Number 클래스의 하위클래스
        MyMath<Double> m1 = new MyMath<>();
        System.out.printf("%.1f", m1.getAverage(data));

//        String[] value = {"1","2","3"};    //String 클래스는 Number 클래스의 하위클래스가 아니기떄문에 오류남.
//        MyMath<String> m3 = new MyMath<String>();
//        System.out.println(m3.getAverage(value));
    }
}
