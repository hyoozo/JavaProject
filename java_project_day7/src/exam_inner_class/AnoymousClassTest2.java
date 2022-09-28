package exam_inner_class;

// 추 상 클 래 스
abstract class AsInner{
    int x;
    int y;

    public AsInner(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 추 상 메 서 드
    public abstract void display(String data);
}
class AsOuter{
    public void outerDisplay(AsInner obj){
        obj.display("Outer.display / 난 AsOuter클래스에서 매개변수야/");
    }
}
class AsInnerExtend extends AsInner{
    // 상속했으니까 재정의 해줘야지 맞아! 아니야?
    public AsInnerExtend(int x, int y) {
        super(x,y);
    }

    public void display(String data) {
        System.out.println("display("+data+")"+x+" "+y);
    }
}
public class AnoymousClassTest2 {
    public static void main(String[] args) {
        /*AsInnerExtend as = new AsInnerExtend ( 10, 20 ) ;   > AsInner 하위 클래스
             AsOuter out = new AsOuter();
             out.outerDisplay(as);    >>> outerDisplay(AsInner obj)
         */

        AsOuter out = new AsOuter();
        out.outerDisplay(new AsInner(10,20) {
            @Override
            public void display(String data) {
                System.out.println("AsInner.display("+data+") : "+x+","+y);
            }
        });
    }
}
