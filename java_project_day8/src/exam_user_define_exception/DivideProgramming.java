package exam_user_define_exception;

//사용자 정의 예외 클래스 선언
@SuppressWarnings("serial")
class DivideByZoroException extends Exception {
    // class DivideByZreoException extends ArithmeticException { // class 사용자 정의 예외 클래스 extends 예외
    private String msg;

    public DivideByZoroException(){
        //super ("0으로 나눌수는 없음.");
    }

    public DivideByZoroException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        if (msg == null) {
            return "0으로 나눌수는 없음.";
        } else {
            return msg;
        }
    }
}


public class DivideProgramming {
    public static void main(String[] args) {
        double result;
        try {
            result = quotient(1, 0);
            System.out.println(result);
        } catch (DivideByZoroException e) {
            System.out.println(e.getMessage());
//            System.out.println(e.toString());
        }
    }
    public static double quotient (int n, int d) throws DivideByZoroException {
        if ( d == 0 )// 예외상황
            throw new DivideByZoroException(); //예외 객체 생성
        return (double) n/d;
    }
}
