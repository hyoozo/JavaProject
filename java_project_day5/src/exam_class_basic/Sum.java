package exam_class_basic;

public class Sum {
    public int sum1(){
        int num1 = 3;
        int num2 = 5;
        return num2 + num1;
    }

    public int sum2(int a, int b) {
        return a + b;
    }
    public double avg(int x, int y){
        return (x+y)/2.0;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int sumresult = sum.sum1();
        System.out.println(sumresult);

        int result = sum.sum2(10,20);
        System.out.println(result);

        double avgresult = sum.avg(2,5);
        System.out.println(avgresult);

    }
}
