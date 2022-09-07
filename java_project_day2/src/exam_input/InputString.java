package exam_input;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        String add;
        int age;

        System.out.println("이름을 입력하세요 : ");
        name = scan.nextLine();

        System.out.println("나이를 입력하세요 : ");
        age = scan.nextInt();
        scan.nextLine();
        // 앞에 nextInt의 엔터값때문에 개행문자를 제거해야함으로 이코드로 엔터를 받고
        //다음 nextLine의 주소값을 받는다.

        System.out.println("주소를 입력하세요 : ");
        add = scan.nextLine();

        System.out.println(name + "님 안녕하세요!" + age +"살이시네요.");
        System.out.println("주소는" + add +"이네요.");

        scan.close();
    }
}
