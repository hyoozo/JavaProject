
package exam_interface;

interface MyInterface{ //인터페이스
    public void print();
}

class MyClass1 implements MyInterface { //구현클래스 MyInterface 인터페이스를 구현하여 정의한 클래스
//인터페이스에 정의된 추상 메소드를 오버라이딩 해야 한다.
    @Override
    public void print() {
        System.out.println("MyClass1");
    }
}

class MyClass2 implements MyInterface { //구현클래스
    @Override
    public void print() {
        System.out.println("MyClass2");
    }
}
public class MyClassExample {
    //인터페이스명 참조변수 = new 구현클래스의 생성자() // 다형성
    //                         (인터페이스 참조변수)
    public static void test(MyInterface myInterface) {
        myInterface.print();
    }

    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        
        mc1.print();
        //*console* MyClass1
        mc2.print();
        //*console* MyClass2
        System.out.println();
        
        // 인터페이스명 참조변수 = new 인터페이스명() //이름이 없는 클래스에 상속받은 객체
        // { };  //이름이 없는 클래스 선언
        MyInterface mi = new MyInterface() {
            @Override
            public void print() {
                System.out.println("익명 클래스로 구현");
            }
        };
        test(mc1);  // MyClas1 의 참조값(주솟값)을 인자로 전달
        //*console* MyClass1
        test(mi);  // 익명클래스의 참조값(주솟값)을 인자로 전달. 결과는 익명 클래스로 구현
        //*console* 익명 클래스로 구현
        mi.print();
        //*console* 익명클래스로 구현
        System.out.println();

        (new MyInterface() {
            @Override
            public void print() {
                System.out.println("선언, 생성, 호출을 한번에 처리");
            }
        }).print();
        // 람다식으로 작성시
        // ((MyInterface) () -> System.out.println("선언, 생성, 호출을 한번에 처리")).print();
        //*console* 선언, 생성, 호출을 한번에 처리
        System.out.println();
        
        test(new MyInterface() {
                 @Override
                 public void print() {
                     System.out.println("메서드 호출 시 선언, 생성.");
                 }
             });
        // 람다식으로 작성시
        // test(() -> System.out.println("메서드 호출 시 선언, 생성."));
        //*console* 메서드 호출 시 선언, 생성.
        System.out.println();

        MyInterface mi2 = test2();
        mi2.print(); // test2() 메서드에서 반환된 MyInterface 를 구현한 구현 클래스의 주솟값
        //*console* test2() 메서드에서 반환된 MyInterface
    }
    public static MyInterface test2(){
        return new MyInterface() {
            @Override
            public void print() {
                System.out.println("test2() 메서드에서 반환된 MyInterface");
            }
        };
        //        MyInterface mi = new MyInterface() {
        //            @Override
        //            public void print() {
        //                System.out.println("test2() 메서드에서 반환된 MyInterface");
        //            }
        //        };
        //        return  mi;
    }
}
