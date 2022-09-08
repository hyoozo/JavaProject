package hy_test_exam;

public class Day4Test {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';
        int intValue1 = byteValue;
        int intValue2 = charValue;
//        short shortValue = charValue;   //오류발생 char2바이트를 chort도 2바이트로 같은크기로 강제 형변환해야됨
        short shortValue = (short)charValue;   //(short)로 형변환
        double doubleValue = byteValue;

        int intValue = 10;
        char charValue1 = 'A';
        double doubleValue1 = 5.7;
        String strValue = "A";
        double var1 = (double) intValue;
        byte var2 = (byte)intValue;
        int var3 = (int)doubleValue1;
//        char var4 = (char)strValue;  //오류발생
        char var4 = strValue.charAt(0);  //String은 참조형으로 형변환 불가함으로 charAt 메소드 사용하기 (0)은 0번째라는 뜻

        int vara = 10;
        long varb = 10000000000L;
//        char varc = '';   //오류발생 스페이스바도 없기에 char는 허용하지 않음
        char varc = ' ';   // 빈칸 넣기, 공백도 문자로 인식함  ' ' or '\0' 둘다 같은뜻
        float vard = 10; //내부적으로 10.000을 붙여주기에 문제안됨
        String vare = "abc\ndef";

        byte byteValue1 = 10;
        float floatValue = 2.5F;
        double doubleValue2 = 2.5;
//        byte result1 = byteValue1 + byteValue1;  //오류발생
        int result1 = byteValue1 + byteValue1;  // ????
        int result2 = 5 + byteValue1;
        float result3 = 5 + floatValue;
        double result4 = 5 + doubleValue2;

        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z); //31

        int score = 85;
        String result = (!(score>90))? "가":"나";  //!부정연산자로 false 를 true로 되어 참이됨
        System.out.println(result);  //가

        int g = 10;
        int h = 5;
        System.out.println( (g>7) && (h<= 5) );  //true
        System.out.println( (g%3 == 2) || (h%2 != 1) ); //false
    }
}
