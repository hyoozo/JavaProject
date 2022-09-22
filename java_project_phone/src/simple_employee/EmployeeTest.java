package simple_employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        EmployeeInfo[] employees = new EmployeeInfo[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println(i+1+"번째 사번을 입력하세요.");
            String name = scan.nextLine();
            System.out.println(name+"사원의 기본급을 입력하세요.");
            int pay = scan.nextInt();
            scan.nextLine();
//            EmployeeInfo employeeInfo = new EmployeeInfo(name, pay);
//            employees[i] = employeeInfo;
            employees[i] = new EmployeeInfo(name, pay);  // 한줄로 가능.
        }
        System.out.printf("%30s\n","봉급계산서");
        System.out.println("============================================");
        System.out.printf("%3s%7s%9s%10s%10s\n","사번","기본급","수당","세금","본봉","등급");
        System.out.println("===========================================");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].showMeThePrint());
        }
//        for (int i = 0; i < employees.length; i++){
//            System.out.println("사번 : "+employees[i].getEmpNo());
//            System.out.println("기본급 : "+employees[i].getBasicPay());
//            System.out.println("수당 : "+employees[i].getExtraPay());
//            System.out.println("세금 : "+employees[i].getTax());
//            System.out.println("본붕 : "+employees[i].getSalary());
//            System.out.println("등급 : "+employees[i].getGrade());
//        }
        System.out.println();
    }
}

