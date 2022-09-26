package exam_interface;

import javax.swing.plaf.PanelUI;

public class Radio implements RemoteControl{
    //Radio 구현 클래를 생성하여 전원을 켜고 끄는, 불륨을 조절하는 메서드를 오버라이딩하여 출력


    @Override
    public void turnOn() {
        System.out.println("라디오 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

    }
}
