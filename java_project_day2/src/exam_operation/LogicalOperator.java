package exam_operation;

public class LogicalOperator {
    public static void main(String[] args) {
        int x  = 3;
        int y = 4;

        System.out.println((x == 3) && (y == 7));
        System.out.println((x == 3) || (y == 4));

        boolean result = (++x == 3) && (y++ == 7); //x=4 y=4

        System.out.println("x= " + x + ", y= "+ y);
        System.out.println("result= "+ result);

        result = (x++ == 4) || (++y == 7); // x=4(비교먼저후 커진다.) y=5(하지만 앞에서 참이 나와서 y=4가 된다.

        System.out.println("x= " + x + ", y= "+ y); // x=5 y=4
        System.out.println("result= "+ result);
    }
}
