package hy_test_exam;

import java.util.Scanner;

//수량, 단가를 입력받아 금액(수량*단가)을 계산한 후
//25%를 할인하여 원래금액, 할인액, 지불금액을 출력하는 프로그램을 작성하시오.
public class Example3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qty; //제품수량
        int price; //제품가격
        double percent = 0.25;
        double discount; //할인된가격
        double sum; //구매금액
        double pay; //지불금액

        System.out.print("제품 수량을 입력하세요 : " );
        qty = scan.nextInt();
        System.out.print("제품 금액을 입력하세요 : " );
        price = scan.nextInt();

        sum = qty * price;
        discount = sum * percent;
        pay = sum - discount;


        System.out.println("제품을 구매한 가격은 얼마인가요 ? " + (int)sum);
        System.out.println("할인금액은 얼마인가요 ? " + (int)discount + " (할인율 : " + percent +"%)");
        System.out.println("지불해야될 금액은 얼마인가요 ? " + (int)pay);

        scan.close();
    }
}
