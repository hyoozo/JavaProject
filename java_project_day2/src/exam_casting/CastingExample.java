package exam_casting;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 65;
        System.out.println("int 65 : " + (char)intValue);

        long longValue = 500L;
        intValue = (int)longValue;
        System.out.println("intValue(500L) : " + intValue);

        double doubleValue = 3.14;
        intValue = (int)doubleValue;
        System.out.println("intValue (3.14) : " + intValue);

        int result;
        double resultDouble;

        result = 3/2;
        System.out.println("result (int 3/2 ) : " + result);

        resultDouble = 3.0 / 2.0;
        System.out.println("resultDouble : " + resultDouble);
    }
}
