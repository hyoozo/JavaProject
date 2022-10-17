package exam_object_stream;

import java.io.Serializable;

public class Account implements Serializable { //직렬화하려면 Serializable 인터페이스 구현하기
//    private static final long serialVersoin
    private String accountNo; //계좌번호
    private String ownerName; //예금주명
    private int balance;  // 금액

    public Account(){
        //필요에 따라 디폴스 생성자를 생성한다. (현재 클래스에서는 없어도됨)
    }
    public Account(String accountNo, String ownerName, int balance){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌번호: "+ this.accountNo
                +"\n예금주명: " + this.ownerName
                +"\n금액: "+ this.balance;
    }
}
