package exam_none_generic_type;

public class Box {
    private Object data;  //어떤 타입도 다 대입가능한 최상위 클래스 타입으로 선언.

    //설정자
    public void set(Object data) {
        this.data = data;
    }

    //접근자
    public Object get() {
        return data;
    }
}
