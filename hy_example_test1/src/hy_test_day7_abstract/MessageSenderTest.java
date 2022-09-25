package hy_test_day7_abstract;

public class MessageSenderTest {
    public static void main(String[] args) {
        EMailSender eMailSender = new EMailSender("생일을 축하합니다.","고객센터","admin@dukeeshop.co.kr","10%할인 쿠폰이 발행되었습니다.");
        SMSSender smsSender = new SMSSender("생일을 축하합니다.","고객센터","02-000-0000","10%할인 쿠폰이 발행되었습니다.");

        eMailSender.sendMessage("admin@dukeeshop.co.kr");
        smsSender.sendMessage("010-0000-0000");

    }
}
