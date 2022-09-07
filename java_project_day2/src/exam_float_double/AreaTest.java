package exam_float_double;

public class AreaTest {
    public static void main(String[] args) {
        double radius, area, cir;
        final double PI = 3.14;
        radius = 5.0;

        area = PI * radius * radius;
        cir = 2 * PI * radius;

        System.out.println("원의 면적은" + area);
        System.out.println("원의 둘레는"+ cir);

        // 출력방법 (원의 면접과 원의 둘레의 값을 소숫점 2자리로 표현)
        System.out.printf("원의 면적 : %.2f 원의 둘레 : %.2f", area, cir);
                                    // 소수점 표현 안하고 싶을때는 %.0f으로 기입
    }
}
