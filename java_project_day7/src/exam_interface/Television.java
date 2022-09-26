package exam_interface;

public class Television implements RemoteControl{
                        //implements 구현하겠다. 라는 명시임.
    private int volume;  // Television 클래스에서 선언할 필드
    private int channel;

    @Override   // 오버라이드 재정의하는것임.
    public void turnOn() {
        System.out.println("TV 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끄기");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){    //만약 500을 준다고 했을때 IF문으로 최대 값을 가져오고
            this.volume = RemoteControl.MAX_VOLUME;
        } else if ( volume < RemoteControl.MIN_VOLUME) {  //최소값을 가져온다.
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
        this.volume = volume;
    }
}
public void printChannel(){
    System.out.println("현재 채널 선택은 "+ channel+"번 입니다.");
    }
    public String toString(){
        return "현재 TV 볼륨 : " + volume;
    }
}
