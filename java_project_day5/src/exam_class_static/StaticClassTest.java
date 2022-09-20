package exam_class_static;

import java.util.Scanner;

public class StaticClassTest {
    private static Scanner scan = new Scanner(System.in);
    private static int num1, num2;

    public static void numberInput(){
        System.out.println("첫번째 숫자를 입력해 주세요. : ");
        num1 = scan.nextInt();
        System.out.println("두번째 숫자를 입력해 주세요. :");
        num2 = scan.nextInt();
    }
    public static int add(int x, int y){
        return x+y;
    }

    public static void main(String arge[]){
        numberInput();;
        int sum = add(num1, num2);
        System.out.println("두 수의 합 : "+sum);

    }
}
