package exam_for;
/*
난수란 정의된 범위 내에서 무작위로 추출된 수를 일컫는다. 난수는 누구라도 그 다음에 나올 값을 확신할 수 없어야 한다.
이때 난수를 얻기 위해 자바에서는 Math.random() 사용한다. 그럼 0~1사이의 실수값을 반환한다.
System.out.println(Math.random());
0.9112051420765848
0.6601870714983942
0.0549177518216343
 */
public class RandomExample {
    public static void main(String[] args) {
        System.out.println(Math.random());

        System.out.println((int)(Math.random() * 10));   //0~9 사이의 정수값 출력
        System.out.println((int)(Math.random() * 10) + 1);   // 1~10 사이의 정수값 출력

        int num = (int)(Math.random() * 6) +1;   //*6 나오고싶어하는 수 만큼 곱하고 +1 그럼 6까지 출력....
        System.out.println("주사위 : " + num);
    }
}
