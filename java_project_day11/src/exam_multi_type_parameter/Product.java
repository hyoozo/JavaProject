package exam_multi_type_parameter;

public class Product <T, M> {
    private T kind;  //상품종류
    private M model;  //상품의 모델명

    public Product() {

    }
    public Product(T kind, M model) {
        this.kind = kind;
        this.model = model;
    }
    public T getKind(){
        return this.kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "kind : " + kind.getClass().getSimpleName().toUpperCase() + ", model : " + model;
                                            //getName : 패키지명과 클래스명을 다 가져온다
                                            //getSimpleName : 클래스명만 가져온다.
                                                            //toUpperCase : 앞에 클래스명을 가져오되 대문자로 변환하겠다는 의미
    }
}
