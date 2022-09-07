package exam_operation;

import java.util.stream.Stream;

public class StringConcatExample {
    public static void main(String[] args) {
        String  str1 = "JDK" + 17;
        String str2 = str1 + "버전";
        System.out.println(str2); // 연결연산자

        String str3 = "JDK" + 15 + 2.0;  //문자가 먼저오면 전부 연결 연산자
        String str4 = 15 + 2.0 + "JDK";  //숫자가 먼저 오면 산술 연산자 와 연결연산자
        System.out.println(str3);
        System.out.println(str4);

        int a = Integer.parseInt("1") + Integer.parseInt("4");
        System.out.println(a);

            //parsetInt()의 기능은 String타임의 숫자를 int타입으로 변환해주는 녀석임
            //문자를 int로 변경했기에 앞에 변수도 int로 줘야 함.
    }
}
