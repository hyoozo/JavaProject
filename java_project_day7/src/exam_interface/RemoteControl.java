package exam_interface;

public interface RemoteControl{
    public static final int MAX_VOLUME = 32;
    int MIN_VOLUME = 0; //public static final 생략됨

    public abstract void turnOn();  //선언만하여 구현클래스에서 재정의 해야되는 것임.
    public abstract void turnOff();
    void setVolume(int volume);  //public abstract 생략됨

    public default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    public static void changeBattert(){
        System.out.println("건전지를 교환합니다.");
    }
}
