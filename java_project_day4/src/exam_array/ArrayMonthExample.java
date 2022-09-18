package exam_array;

import java.util.Scanner;

public class ArrayMonthExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int su ;

        do{
            System.out.println("원하는 달 : ");
            su = scan.nextInt();

        }while (su<1 || su>12);
        System.out.println(su + "월은 " + month[su - 1] + "일입니다...");
        scan.close();
    }
}
