package exam_float;

public class AreaTest {
    public static void main(String[] args) {
        double radius, area, cir;
        final double PI = 3.14;
        radius = 5.0;

        area = PI * radius * radius;
        cir = 2 * PI * radius;

        System.out.println("원의 면적은" + area);
        System.out.println("원의 둘레는" + cir);
        System.out.printf("원의 면적  %.2f 원의 둘레 : %.2f ", area, cir);


    }
}
