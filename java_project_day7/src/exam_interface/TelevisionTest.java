package exam_interface;

public class TelevisionTest {
    public static void main(String[] args) {
//        RemoteControl rc = new RemoteControl();  /오류임

        Television tv = new Television();
        RemoteControl.changeBattert();  //인터페이스명.static메서드()  정적호출하는 법
        tv.turnOn();
        tv.setVolume(20);
        System.out.println(tv.toString());
        tv.setMute(true);
        tv.turnOff();
        System.out.println();
        /* 건전지를 교환합니다.
            TV 켜기
            현재 TV 볼륨 : 20
            무음 처리합니다.
            TV 끄기*/

        //Radio 구현 클래를 생성하여 전원을 켜고 끄는, 불륨을 조절하는 메서드를 오버라이딩하여 출력
        Radio radio = new Radio();
        radio.turnOn();  //라디오 전원을 켭니다.
        radio.turnOff();  //라디오 전원을 끕니다.

        SmartTelevision smart = new SmartTelevision();
        smart.turnOn();
        smart.search("http://www.naver.com");
        smart.turnOff();
        /*  SmartTelevision 켜기
            http://www.naver.com을 검색합니다.
            SmartTelevision 끄기*/
    }
}
