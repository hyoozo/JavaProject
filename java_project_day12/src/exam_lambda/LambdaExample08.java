package exam_lambda;

interface Calculator{
    int func();
}
public class LambdaExample08 {
    static int num1 = 10;
    int num2 = 20;

    public static void main(String[] args) {
        LambdaExample08 lamb8 = new LambdaExample08();
        int num3 = 30;


        Calculator calc = () -> {
            int num4 = 40;
            LambdaExample08.num1++;  //static 이라서 클래스명.변수이름
            lamb8.num2++; //인스턴스필드라서 인스턴스변수이름.변수이름
//            num3++; //값을 수정하는것은 안됨.
            System.out.println("num3은:" + num3); // 불러와서 출력하는것은 가능함.
            num4++;
            return num4;
        };
        System.out.println("실행결과: " + calc.func());
                        //실행결과: 41
    }
    /*
    public class test {
        int iv;         // 인스턴스 변수 (= 인스턴스가 생성될 때)
        static int cv;  // 클래스 변수  (= 클래스가 메모리에 올라갈 때)

        void method() {
            int lv;     // 지역 변수  (= 변수 선언문이 수행 되었을 때)
            }
     }
     */
}
