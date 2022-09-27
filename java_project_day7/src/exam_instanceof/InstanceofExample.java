package exam_instanceof;
class Parent{
    String field1;
    public void method1(){
        System.out.println("Parent-method1()");
    }
    public void method2(){
        System.out.println("Parent-method2()");
    }
}
    //서브           슈퍼
class Child extends Parent{
    String field2;
    public void method3(){
        System.out.println("Child-method3()");
    }
}
public class InstanceofExample {
    /*슈퍼 클래스로부터 상속받은 필드와 메서드.
    단, 서브 클래스에서 오버라이딩하면 그때부터는 오버라이딩된 메서드
                                  메서드명 (슈퍼클래스 참조변수) 슈퍼클래스 참조변수 = 서브클래스의 참조값. 업캐스팅.*/

    public static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.field2 = "Child 로 변환 성공";
            System.out.println("method1 -" + child.field2);
        } else {
            System.out.println("method1 - Child 변환되지 않음");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;          //ClassCastException 에러남..
                                                // 업캐스팅 안되어 있어서 그럼.
        child.field2 = "Child 로 변환 성공";
        System.out.println("method2 - "+child.field2);
    }

    public static void main(String[] args) {
       //슈퍼클래스 참조변수 = new 서브클래스의 생성자(). 업캐스팅
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        //클래스  참조변수  = new 생성자(). 현재 업캐스팅 X   > 다운캐스팅도 안됨.
        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB);
    }

    }

