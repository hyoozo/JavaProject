//package exam_polymorphism;
//
//public class ClassTest {
//    public static void main(String[] args) {
//        // A a1 = new A();
//        // AA a2 = new AA();
//
//        A z = new AA();
//        System.out.println(z.a);
//        z.b();
//        //z.c(); 컴파일 오류남
//
//        ((AA)z).c();
//        System.out.println(((AA)z).a);
//
//        AA a1 = (AA) z;
//        System.out.println(a1.a);
//        a1.c();
//
//        z = new BB();  //업캐스팅
//        System.out.println(z.a);
//        z.b();
//        //z.b();
//        ((BB)z).d();
//        System.out.println(((BB)z).a);
//
//        BB b1 = (BB)z;  //다운캐스팅
//        b1.d();
//        System.out.println(b1.a);
//    }
//}
