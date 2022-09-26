package hy_test_day7_interface;
/* 대출가능인터페이스
    [기능]
    대출한다 (checkOut (String borrower, String date))
    반납한다 (checkIn())
 */
public interface Lendable {
    public String checkOut(String borrower, String date);
    public String checkIn();

}
