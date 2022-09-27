package hy_test_day7_interface;
/* 대출가능인터페이스
    [기능]
    대출한다 (checkOut (String borrower, String date))
    반납한다 (checkIn())
 */
public interface Lendable {
    // 매개변수를 가지고있는 추상메서드를 만들었다.
    public abstract void checkOut(String borrower, String date);


    public abstract void checkIn();
}
