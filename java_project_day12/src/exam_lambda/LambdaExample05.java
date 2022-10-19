package exam_lambda;

interface MyFunction<T>{
    T modify(T data);
}
public class LambdaExample05 {
    public static void main(String[] args) {
        MyFunction<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
                                        // .toUpperCase()대상 문자열을 모두 대문자로 변환합니다
        System.out.println("결과값:" + mf1.modify("java"));
                        //결과값:JAVA:4
        System.out.println("결과값:" + mf1.modify("java programming"));
                        //결과값:JAVA PROGRAMMING:16

        MyFunction<Integer> mf2 = (n) -> n * 2;
        System.out.println("결과값:" + mf2.modify(22));
                        //결과값:44
        System.out.println("결과값:"+mf2.modify(43));
                        //결과값:86
    }
}
