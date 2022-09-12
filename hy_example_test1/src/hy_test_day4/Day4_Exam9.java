package hy_test_day4;

import java.util.Scanner;

public class Day4_Exam9 {
    public static void main(String[] args) {
        int porkCutlet = 8000;
        int kalguksu = 6000;
        int wangMandu = 5000;
        int porkSum = 0;
        int kalSum = 0;
        int wangSum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("돈까스, 칼국수, 왕만두 순서대로 주문 수량을 입력하세요.>>>  ");
        int porkNum = scan.nextInt();
        int kalNum = scan.nextInt();
        int wangNum = scan.nextInt();


        if(porkNum >= 0) {
            porkSum = porkCutlet * porkNum;
            System.out.println("돈가스 X "+porkNum+" = "+porkSum);
        } if(kalNum >= 0){
            kalSum = kalguksu * kalNum;
            System.out.println("칼국수 X "+kalNum+" = "+kalSum);
        } if(wangNum >= 0){
            wangSum = wangMandu * wangNum;
            System.out.println("왕만두 X "+wangNum+" = "+wangSum);
        }
        System.out.println("===================");
        System.out.println("총합 : "+(porkSum+kalSum+wangSum));

        scan.close();
    }
}
