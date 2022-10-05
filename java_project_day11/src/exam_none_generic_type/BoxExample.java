package exam_none_generic_type;

import java.util.function.DoublePredicate;

public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();

        box.set("홍길동");
        String name = (String) box.get();  //반환하는 형이 Object 그래서 String 타입으로 변환한거임
        System.out.println("name = " + name);
                            //name = 홍길동

        //Box에 정수형의 값 5 대입 -1
        box.set(Integer.valueOf(5));
        Integer i = (Integer) box.get();
        System.out.println("i = "+i.intValue());  //언박싱
                                    //i = 5

        //Box에 정수형의 값 5 대입 -2
        box.set(5);
        int ivalue = (Integer) box.get();
        System.out.println("iValue = "+ivalue);
                            //iValue = 5

        //Box에 실수형의 값 (8.4) 대입 -1
        Double dNum = Double.valueOf(8.4);
        box.set(dNum);
        Double d = (Double) box.get();
        System.out.println("d = "+d.doubleValue());
                            //d = 8.4

        //Box에 실수형 값 8.4 대입 -2
        box.set(8.4);
        double dValue = (Double) box.get();
        System.out.println("dValue = " + dValue);
                            //dValue = 8.4

        Character ch = Character.valueOf('잠');
        box.set(ch);
        Character c = (Character) box.get();
        System.out.println(c.charValue());
                            //잠

        box.set('잠');
        char cValue = (Character) box.get();
        System.out.println(cValue);
                            //잠

        //color를 필드로 갖는 Apple 클래스를 생성하여 Box 클래스에 설정해보다.
        box.set(new Apple("빨간색"));
        Apple apple = (Apple) box.get();
        System.out.println(apple.toString());
                            //exam_none_generic_type.Apple@15aeb7ab   toString 재정의 안했을때
                            //Apple [ color : 빨간색]   toString 재정의해서 이거 나오는거임.

        String str = "java";
        box.set(str);
        System.out.println("값 : "+ (Integer)box.get());  // 실행오류가 발생되는 코드임. ㅡㅡ


    }
}
