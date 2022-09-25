package exam_classExampleProglram;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    private static int count = 0;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("+---------------------------------------+");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("+---------------------------------------+");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
    private static void createAccount(){  //계좌생성
        System.out.println("+---------------- 계좌생성 ----------------+");
        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        accountArray[count++] = new Account(ano, owner, balance);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void accountList(){   //계좌목록
        System.out.println("+---------------- 계좌목록 ----------------+");
        for (int i = 0; i < count; i++) {
            System.out.println(
                    accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
        }
    }

    private static void deposit(){      //예금
        System.out.println("+---------------- 계좌예금 ----------------+");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int balance = scanner.nextInt();

        if (findAccount(ano) == null) {
            System.out.println("입력한 계좌번호를 찾지 못했습니다.");
        } else {
            findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
            System.out.println("결과: 입금이 성공되었습니다.");
        }
    }

    private static void withdraw(){     //출금
        System.out.println("+---------------- 계좌출금 ----------------+");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int balance = scanner.nextInt();

        if (findAccount(ano) == null) {
            System.out.println("입력한 계좌번호를 찾지 못했습니다.");
        } else {
            if (balance > findAccount(ano).getBalance()) {
                System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
            } else {
                findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
                System.out.println("결과: 출금이 성공되었습니다.");
            }
        }
    }
    private static Account findAccount(String ano) {
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                break;
            }
            if (accountArray[i].getAno().equals(ano)) {
                return accountArray[i];
            }
        }
        return null;
    }
}
