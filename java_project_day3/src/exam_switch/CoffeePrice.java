package exam_switch;

import java.util.Scanner;

public class CoffeePrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" 무슨 커피 드릴까요? ");
        String order = scan.next();
        int price = 0;

        switch (order) {
            case "카푸치노", "카페라떼" -> price = 3500;
            case "에스프레소", "아메리카노" -> price = 2000;
            default -> System.out.println("메뉴에 없습니다!");
        }
        if (price != 0){
            System.out.println(order+"는"+price+"원입니다.");
        }
        scan.close();
    }
}


