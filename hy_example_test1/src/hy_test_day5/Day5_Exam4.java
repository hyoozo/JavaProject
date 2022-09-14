package hy_test_day5;

import java.util.Scanner;

//array배열은 길이가 10인 1차원 배열로 아래와 같은 규칙을 가지고 있다.
//두 수를 입력한 후, 입력한 수를 가지고 만든 array 배열을 출력하는 프로그램을 만들라
//[규칙] 1. 10미만의 정수 두 개를 입력 받아서 첫번째 원소와 두번쩨 원소를 입력 받은 수로 초기화 한다.
//      2. 세번째 원소 부터 마지막 원소까지 전전항과 전항을 곱한 값의 1의 자리이다.
//[실행결과]
//  숫자 두개를 입력해주세요 : 3 4
//  [3,4,2,8,6,8,8,4,2,8]
public class Day5_Exam4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1차원 배열 정하기 배열크기 10개
        //배열 0번째 1번째 숫자 10이하 입력받기
        int arr[] = new int[10];

        System.out.print("숫자 두 개를 입력해 주세요 : ");
        int num = scan.nextInt();
        num = scan.nextInt();
        if(num>10){
            System.out.println("10이하로 입력하셈");

        }
        System.out.println(num);

    }
}
//과제임