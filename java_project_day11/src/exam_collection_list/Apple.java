package exam_collection_list;

public class Apple{
    private String kind;
    private String color;

    public Apple(String kind, String color) {
        this.kind = kind;
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "사과의 품종 : " +this.kind + " 색상 : " + this.color;
    }
}
