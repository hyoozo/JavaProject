package simple_employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        EmployeeInfo employeeInfo = new EmployeeInfo();
//        EmployeeInfo employeeInfo2 = new EmployeeInfo();
//        EmployeeInfo employeeInfo3 = new EmployeeInfo();
//        EmployeeInfo[] array = {employeeInfo,employeeInfo2,employeeInfo3};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i+1+"번째 사번을 입력하세요.");
//            String name = scan.nextLine();
//            array[i].setEmpNo(name);
//            System.out.println(name+"사원의 기본급을 입력하세요.");
//            int pay = scan.nextInt();
//            scan.nextLine();
//            array[i].setBasicPay(pay);
//            array[i].setExtraPay(array[i].getBasicPay());
//            array[i].setTax(array[i].getBasicPay());
//            array[i].setSalary(array[i].getBasicPay(), array[i].getExtraPay(), array[i].getTax());
//            array[i].setGrade(array[i].getSalary());
//        }

//        EmployeeInfo employeeInfo = new EmployeeInfo();
//        EmployeeInfo employeeInfo2 = new EmployeeInfo();
//        EmployeeInfo employeeInfo3 = new EmployeeInfo();

        EmployeeInfo[] employees = new EmployeeInfo[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println(i+1+"번째 사번을 입력하세요.");
            String name = scan.nextLine();
            System.out.println(name+"사원의 기본급을 입력하세요.");
            int pay = scan.nextInt();
            scan.nextLine();
            EmployeeInfo employeeInfo = new EmployeeInfo(name, pay);
            employees[i] = employeeInfo;
        }

        for (int i = 0; i < employees.length; i++){
            System.out.println("사번 : "+employees[i].getEmpNo());
            System.out.println("기본급 : "+employees[i].getBasicPay());
            System.out.println("수당 : "+employees[i].getExtraPay());
            System.out.println("세금 : "+employees[i].getTax());
            System.out.println("본붕 : "+employees[i].getSalary());
            System.out.println("등급 : "+employees[i].getGrade());
        }
        System.out.println();

        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

    }
}

