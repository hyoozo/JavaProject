package exam_check_synchronized;

import exam_check_unsynchronized.MyAccount;


public class User extends Thread {
    //사용자는 동시에 Account 에 접근 할 수 있으므로 thread 로 생성
    private String userName; // 사용자명
    private MyAccount account; // 사용자가 사용하는 계좌

    public User(String userName, MyAccount account) {
        this.userName = userName;
        this.account = account;
    }

    @Override
    public void run() { //실제로 사용사자 접근했을때 실행구문
        for (int i = 0; i < 5; i++) {
            int m = (((int) (Math.random() * 3) * 100) + 200); // 200~400
            // 출금 & 입금할 금액을 랜덤으로 주기위해 코드 짬.
            //0.9 * 3 = 2.7 -> (int) 이므로 2
            //2 * 100 = 200
            //200 + 200 = 400

            if (i % 2 == 0) {
                account.withdraw(m, userName);
            } else {
                account.deposit(m,userName);
            }
            //시간간격을 두고 실행을 시키기 위해
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
