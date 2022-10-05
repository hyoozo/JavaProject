package exam_api_stringbuffer.exam01_math;

public class MathExample {
    public static void main(String[] args) {
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println("v1(Math.abs)="+v1);
        System.out.println("v2(Math.abs)="+v2);

        double v3 = Math.ceil((5.13)); //매개변수 값을 올림함.
        System.out.println("v3(Math.ceil)=" + v3);

        double v4 = Math.floor(5.9);  //매개변수 값을 내림함.
        System.out.println("v4(Math.floor)=" + v4);

        int v5 = Math.max(5, 9);  //최댓값을 구함
        double v6 = Math.max(2.3, 2.5);
        System.out.println("v5(Math.max)=" + v5);
        System.out.println("v6(Math.max)=" + v6);

        int v7 = Math.min(5, 3);  //최솟값을 구함
        double v8 = Math.max(5.2, 2.5);
        System.out.println("v7(Math.max)=" + v7);
        System.out.println("v8(Math.max)=" + v8);

        long v9 = Math.round(5.3);  //소숫점 첫째 자리에서 반올림함.
        long v10 = Math.round(5.7);
        System.out.println("v5(Math.max)=" + v9);
        System.out.println("v6(Math.max)=" + v10);
    }
}
