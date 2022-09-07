package exam_operation;
//비트 이동 연산자 예제
public class BitShiftExample {
    public static void main(String[] args) {
        byte a = 0b00010001; //2진수 표현은 0b로 시작함
        byte b = 0b00100010;
        System.out.println(a + " " + b);

        int c = a & b;
        System.out.println("c = " + Integer.toBinaryString(c));

        int d = a | b;
        System.out.println("d = " + Integer.toBinaryString(d));

        int e = a ^ b;
        System.out.println("e = " + Integer.toBinaryString(e));

        int f = 12;
        int g = (~f) + 1;
        System.out.println("g = " + g);

        int h = f << 1; // 24
        int i = f >> 1; //6
        System.out.println("h(왼쪽으로 1비트) = " + h);
        System.out.println("i(오른쪽으로 1비트) = " + i);

    }
}
