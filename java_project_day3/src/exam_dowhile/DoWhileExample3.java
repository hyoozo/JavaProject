package exam_dowhile;

import java.util.Scanner;

public class DoWhileExample3 {
    public static void main(String[] args) {

        int num = 0;
        do{
            System.out.println("num의 값:"+num);
            num++;
        } while (num < 0);
        System.out.println();

        int i = 1;  //1에서 10까지 출력
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=10);
        System.out.println();

        i = 10;
        do{
            System.out.print(i+" ");
            i--;
        }while(i>0);
        System.out.println();

        //1에서 100까지의 합을 출력해 주세요 (do ~ while문을 이용해서)
        //사용자에게 문자 및 숫자를 입력 받아서 출력하고자 한다. 종료는 q를 입력.
        System.out.println("메세지를 입력하세요.");
        System.out.println("종료는 q를 입력해라.");
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.print(">");
            str = sc.nextLine();
            System.out.println(str);   //q를 입력할때까지 입력값이 콘솔에 그대로 출력됨..ㅋㅋ
        } while (!str.equals("q"));

        System.out.println();
        System.out.println("종료");

    }
}
