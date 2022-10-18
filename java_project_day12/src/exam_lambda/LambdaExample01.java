package exam_lambda;
interface Multiply{
    boolean check(int n);
}
public class LambdaExample01 {
    public static void main(String[] args) {
        Multiply m;
        m = new Multiply() {
            @Override
            public boolean check(int n) {
                return false;
            }
        };
        System.out.println(m.check(4));

        m = (int d) -> true;
        System.out.println(m.check(3));

        m = (int d) -> false;
        System.out.println(m.check(6));

    }
}
