package exam_inner_class;
class A{  //외부클래스
    private int num;
    static int number;

    A(){
        System.out.println("A 객체가 생성됨");
    }

    class B{  //내부 클래스 - 인스턴스 맴버 클래스-
        int field1;
        //static int value;   인스턴스 맴버 클래스는 satatic 맴버를 가질 수 없다.
        B(){
            num = 5;
            number = 3;
            System.out.println("B 객체가 생성됨");
        }
        void method1(){
            System.out.println("num : " + num);
            System.out.println("number : " + number);
            System.out.println("field1 : "+ field1);
        }
    }

    static class C {   //내부 클래스  - 정적 맴버 클래스 -
        int field1;
        static int field2;
        C (){
//            num = 10;  정적 맴버 클래스는 외부 클래스의 인스턴스 맴버를 가질 수 없다.
            number = 9;
            System.out.println("C 객체가 생성됨");
        }
        void method1(){
            System.out.println("field1 : " + field1);
        }
        static void method2(){
            System.out.println("field2 : " + field2);
        }
    }
    void method(){    //내부 클래스  -- 로컬 클래스 --
        class D{
            int field3;
            D(){
                System.out.println("D 객체가 생성됨");
            }
            void method1(){
                System.out.println("field3 : "+ field3);
            }
        }
        D d = new D();
        d.field3 = 3;
        d.method1();
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();  // 인스턴스 맴버 클래스 객체 생성
           //A.B b = new A().new B();
        b.field1 = 3;
        b.method1();
        System.out.println();

        A.C c = new A.C();  // 정적 맴버 클래스 객체 생성
        c.field1 = 3;
        c.method1();
//        c.method2();

        A.C.field2 = 3;    // 정적 필드.  외부클래스. 내부클래스. 정적필드
        A.C.method2();    //  정적 메서드. 외부클래스. 내부클래스. 정적메서드
        System.out.println();

        // 로컬 클래스 객체 생성을 위한 메서드 호출
        a.method();
        /* console
            A 객체가 생성됨
            B 객체가 생성됨
            num : 5
            number : 3
            field1 : 3

            C 객체가 생성됨
            field1 : 3
            field2 : 3

            D 객체가 생성됨
            field3 : 3
         */
    }
}
