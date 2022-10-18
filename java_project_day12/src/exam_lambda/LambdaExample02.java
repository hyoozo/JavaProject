package exam_lambda;

interface Verify{
    boolean check(int n);
}
public class LambdaExample02 {
    public static void main(String[] args) {
        Verify isEven = new Verify() {
            @Override
            public boolean check(int n) {
                return (n % 2) == 0;
            }
        };
        System.out.println("결과값 : " + isEven.check((3)));

        isEven = (n-> (n % 2) == 0);
        System.out.println("결과값: " + isEven.check(10));

        Verify isOdd =(n -> (n % 2) == 1);
        System.out.println("결과값: " + isOdd.check(9));
    }
}
