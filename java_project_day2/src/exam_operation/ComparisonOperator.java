package exam_operation;

public class ComparisonOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));

        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x <= y : " + (x <= y));

        char char1 = 'A'; //유니코드 65
        char char2 = 'B'; //유니코드
        boolean res = (char1 < char2);
        System.out.print("값은 :" + res);
    }
}
