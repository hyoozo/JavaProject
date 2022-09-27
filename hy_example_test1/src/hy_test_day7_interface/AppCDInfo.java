package hy_test_day7_interface;

//부록 CD클래스
public class AppCDInfo extends CDInfo implements Lendable  {
    private String borrower; //대출인
    private String checkOutDate; //대출일
    private int state; //대출상태

    public AppCDInfo(String registerNo, String title) {
        super(registerNo, title);

    }
    @Override
    public void checkOut(String borrower, String date) {
        if (state !=0 ){  // 대여 중이라면
            return;       //return 값,  return; -메서드를 강제로 종료하겠다는 의미
        }
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1;  //대출(대여)상태
        System.out.println("*"+getRegisterNo()+" "+ getTitle()+" CD가 대출되었습니다.");
        System.out.println("대출인 : "+borrower);
        System.out.println("대출일 : "+date);
        System.out.println();
    }

    @Override
    public void checkIn() {
        if (state == 0) { //이미 반납처리가 되었다면
            System.out.println("이미 반납 처리가 완료되었습니다." +"\n");
            return;
        }
        System.out.println("*"+getRegisterNo()+" "+getTitle()+"CD가 반납되었습니다.");
        System.out.println();
    }

    @Override
    public String toString() {
        return "부록 CD 정보[ 관리번호 : "+getRegisterNo()+", 타이틀 : "+getTitle()+"]";
    }

}
