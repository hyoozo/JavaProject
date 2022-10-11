package exam_collection_set;

public class Key {
    private int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {  //부모 클래스 참조변수 = 서브클래스의 주솟잢 > 업캐스팅
//        if (obj instanceof Key compareKey) {
//            if (this.number == compareKey.number) {
//                return true;
//            }
//        }
        if (obj instanceof Key) {
            Key compareKey = (Key) obj; //서브클래스 참조변수 =(서브클래스) 부모클래스타임 참조변수; > 다운캐스팅
            if (this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return "number: " + number;
    }
}
