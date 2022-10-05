package exam_generic_type_book.generic_type;
class Bag<T>{   //제네릭 클래스
    private T thing;     // 인스턴스 생성시 타입을 결정할 수 있다.

    public Bag(T thing) {
        this.thing = thing;
    }
    public  T getThing(){
        return thing;
    }
    public void setThing(T thing) {
        this.thing = thing;
    }
    void showType(){
        System.out.println("T의 타입은 "+thing.getClass().getSimpleName());
                                            // getClass. getName 하면 패키지명까지 다 가져오니까 SimpleName은 이름만 가져온다~~
    }
}
class Book {
    private String title;
    private String writer;
    public Book(){

    }

    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book [title= " + title + ", writer= " + writer + "]";
    }
}

class PencilCase {
    private String brand;
    private String kind;

    public PencilCase(){

    }

    public PencilCase(String brand, String kind) {
        this.brand = brand;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "PencilCase [brand= " + brand + ", kind= " + kind + "]";
    }
}

class Notebook {
    private String make;
    private String size;

    public Notebook(){

    }

    public Notebook(String make, String size) {
        this.make = make;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Notebook [make= " + make + ", size= " + size + "]";
    }
}
public class BagTest {

    public static void main(String[] args) {
        Bag<Book> bag = new Bag<>(new Book());
        Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
        Bag<Notebook> bag3 = new Bag<>(new Notebook());

        bag.showType();
        bag2.showType();
        bag3.showType();
            /* console
            T의 타입은 Book
            T의 타입은 PencilCase
            T의 타입은 Notebook
             */
        Bag<Book> baga = new Bag<>(new Book("어린왕자","ㅎㅎ"));
        Bag<PencilCase> bagb = new Bag<>(new PencilCase("Apple","app"));
        Bag<Notebook> bagc = new Bag<>(new Notebook("모닝글로리","A4"));

        baga.showType();
        bagb.showType();
        bagc.showType();

        System.out.println(baga.getThing().toString());
        System.out.println(bagb.getThing().toString());
        System.out.println(bagc.getThing().toString());
        /*Book [title= 어린왕자, writer= ㅎㅎ]
        PencilCase [brand= Apple, kind= app]
        Notebook [make= 모닝글로리, size= A4] */


    }
}
