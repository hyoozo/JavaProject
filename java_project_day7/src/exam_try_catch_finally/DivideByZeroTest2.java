package exam_try_catch_finally;

public class DivideByZeroTest2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        try {
            int result = x / y;
            System.out.println("result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없단다.");
        }
        System.out.println("프로그램은 계속 된단다. 아닌데? 종료되는데 ");
    }
}
