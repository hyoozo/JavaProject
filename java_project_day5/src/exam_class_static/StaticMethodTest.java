package exam_class_static;

public class StaticMethodTest {
    private static int num1 = 5;
    private int num2 = 3;

    public static void print1() {
        int num3 = num1;
        System.out.println(num3);
        System.out.println("ptint1()호출함");
    }

    public void print2() {
        int num3 = num1;
        int num4 = num2;
        System.out.println(num3 + "," + num4);
        System.out.println("print2() 호출함");
    }

    public static void main(String[] args) {
        StaticMethodTest.print1();  //정적메소드 호출방법 1
        print1();   //정적메소드 호출방법 2

        StaticMethodTest method = new StaticMethodTest();
        method.print2();
    }
}
