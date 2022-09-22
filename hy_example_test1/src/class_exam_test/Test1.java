package class_exam_test;

public class Test1 {
    public static final double PI = 3.14;
    private double radius;
    public Test1(){}
    public Test1(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static double getPi() {
        return PI;
    }

    public void draw() {
        System.out.println("반지름" + radius + "cm이다.");
    }
}
