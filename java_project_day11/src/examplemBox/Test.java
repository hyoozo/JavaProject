package examplemBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void sum(){

            Scanner sc = new Scanner(System.in);

            System.out.println("1이상 입력 : ");
            int num = sc.nextInt();

            int sum = 0;
            if (num > 0) {
                int i = 1;
                while (i <= num) {
                    sum += i;
                    i++;
                }
                System.out.println("1부터" + num + "까지으 합은" + sum + "입니다.");
            } else {
                System.out.println("숫자 1이상이 아닙니다.");
            }

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.sum();


    }
}
