package exam_if;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        int su1, su2, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("두수를 입력해 주세요 : ");
        su1 = scan.nextInt();
        su2 = scan.nextInt();

        if(su1 > su2){
            temp = su1;
            su1 = su2;
            su2 = temp;
            System.out.println("su1:" +su1 + " " + "su2:"+su2);
        } else {
            System.out.println("su1이 작습니다.");
        }
        scan.close();
    }
}
