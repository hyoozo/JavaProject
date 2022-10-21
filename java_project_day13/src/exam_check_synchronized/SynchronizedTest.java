package exam_check_synchronized;

import exam_check_unsynchronized.MyAccount;

public class SynchronizedTest {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount("홍길동", 10000);
        //        공통계좌의                         계좌 주인       계좌에 있는 돈

        User u1 = new User("회사", myAccount);
        User u2 = new User("가족", myAccount);
        User u3 = new User("친구", myAccount);

        u1.start();
        u2.start();
        u3.start();
        /* // 동기화 안했을때 결과값
        [회사] 출금 : 200
        [회사] 님이 요청한 계좌의 잔액 : 9800
        [친구] 출금 : 200
        [친구] 님이 요청한 계좌의 잔액 : 9600
        [가족] 출금 : 300
        [가족] 님이 요청한 계좌의 잔액 : 9300
        [친구] 입금 : 400
        [회사] 입금 : 300
        [친구] 님이 요청한 계좌의 잔액 : 10000
        [회사] 님이 요청한 계좌의 잔액 : 10000     //이렇게 출력되면 안된다. 동기화 처리가안되서 그렇다.
        [가족] 입금 : 400
        [가족] 님이 요청한 계좌의 잔액 : 10400
        [회사] 출금 : 300
        [회사] 님이 요청한 계좌의 잔액 : 10100
        [친구] 출금 : 300
        [친구] 님이 요청한 계좌의 잔액 : 9800
        [가족] 출금 : 300
        [가족] 님이 요청한 계좌의 잔액 : 9500
        [친구] 입금 : 300
        [회사] 입금 : 400
        [회사] 님이 요청한 계좌의 잔액 : 10200
        [친구] 님이 요청한 계좌의 잔액 : 10200
        [가족] 입금 : 400
        [가족] 님이 요청한 계좌의 잔액 : 10600
        [친구] 출금 : 200
        [친구] 님이 요청한 계좌의 잔액 : 10400
        [회사] 출금 : 300
        [회사] 님이 요청한 계좌의 잔액 : 10100
        [가족] 출금 : 200
        [가족] 님이 요청한 계좌의 잔액 : 9900
         */

        /* 동기화 했을때 결과값 !!!!!!!!!!!!!!!!!!!!!!!!!
        [회사] 출금 : 400
        [회사] 님이 요청한 계좌의 잔액 : 9600
        [가족] 출금 : 400
        [가족] 님이 요청한 계좌의 잔액 : 9200
        [친구] 출금 : 300
        [친구] 님이 요청한 계좌의 잔액 : 8900
        [친구] 입금 : 300
        [친구] 님이 요청한 계좌의 잔액 : 9200
        [가족] 입금 : 400
        [가족] 님이 요청한 계좌의 잔액 : 9600
        [회사] 입금 : 200
        [회사] 님이 요청한 계좌의 잔액 : 9800
        [친구] 출금 : 200
        [친구] 님이 요청한 계좌의 잔액 : 9600
        [회사] 출금 : 200
        [회사] 님이 요청한 계좌의 잔액 : 9400
        [가족] 출금 : 200
        [가족] 님이 요청한 계좌의 잔액 : 9200
        [친구] 입금 : 400
        [친구] 님이 요청한 계좌의 잔액 : 9600
        [회사] 입금 : 300
        [회사] 님이 요청한 계좌의 잔액 : 9900
        [가족] 입금 : 200
        [가족] 님이 요청한 계좌의 잔액 : 10100
        [친구] 출금 : 300
        [친구] 님이 요청한 계좌의 잔액 : 9800
        [가족] 출금 : 400
        [가족] 님이 요청한 계좌의 잔액 : 9400
        [회사] 출금 : 300
        [회사] 님이 요청한 계좌의 잔액 : 9100

         */
    }
}