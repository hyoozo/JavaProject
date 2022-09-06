package exam_variable;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value = 10;

        int result = value + 10;
        System.out.println(result);
        System.out.println("result=" + result);
        System.out.printf("result=%d", result);
        //printf(format) 변수의 값을 출력하기 위해 변환문자 (%)로 명시
        //정수:%d 문자:%c 문자열:%s 실수:%f
    }
}
