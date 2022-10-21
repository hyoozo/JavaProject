package exam_check_unsynchronized;

public class MyAccount {
    private String owner;//계좌 소유자
    private int money; //계좌 보유 금액

    public MyAccount(String owner, int money) { //생성자
        this.owner = owner;
        this.money = money;
    }

    public synchronized void deposit(int amount, String user) { //예금
         //synchronized 동기화 하는 키워드

        if (amount > 0) { //입금 금액이 양수일경우
            money += amount;
            System.out.println("[" + user + "] 입금 : " + amount);
        } else { //음수일경우
            System.out.println("입금액이 옳바르지 않습니다.");
        }
        System.out.println(("[" + user + "] 님이 요청한 계좌의 잔액 : " + money));
    }

    public synchronized void withdraw(int amount, String user) { //출금
        //synchronized 동기화하는 키워드

        if (money - amount > 0) { //내가 가진돈 - 출금액이 양수일경우
            money -= amount; //출금한다.
            System.out.println(("[" + user + "] 출금 : " + amount));
        } else { //음수일경우 돈이 없는거니깐
            System.out.println("금액이 부족합니다.");
        }
        System.out.println(("[" + user + "] 님이 요청한 계좌의 잔액 : " + money));
    }
    public String getOwner(){ //계좌 소유주를 반환할 수있는 접근자 생성
        return owner;
    }
}
