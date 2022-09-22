package exam_if;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        //예제1 : 사용자로 하여금 숫자 하나를 입력받아 짝수와 홀수를 출력하는 코드를 작성해 주세요.
        int su = 0;
        String data = null; // 어떤한값도 갖고 있지 않다라고 표시

        System.out.print("짝수와 홀수를 구할 수를 입력해 주세요.");
        su = scan.nextInt();
        System.out.println("su의 초기값 : " + su);

        if(su%2 == 0){
//            System.out.println("입력한" + su + "는 짝수 입니다.");
            data = "짝수";
        } else{
//            System.out.println("입력한" + su + "는 홀수 입니다.");
            data = "홀수";
        }
        System.out.println("입력한 "+ su + "는 " + data +" 입니다.");
        scan.close();
    }
}
