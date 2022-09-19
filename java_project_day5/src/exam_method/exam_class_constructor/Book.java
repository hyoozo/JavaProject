package exam_method.exam_class_constructor;

public class Book {
    String title;
    String author;

    public Book(){  //디폴트 생성자
        this("","");
    }
    public Book(String title){  //생성자
        this(title,"작자미상");
        System.out.print("매개변수가 하나인 생성자\n");
    }
    public Book(String title, String author){   //생성자
        this.title = title;
        this.author = author;
        System.out.print("매개변수가 두개인 생성자\n");  // 호출이 되었는지 확인방법
    }
    public String toString(){
        return "책제목 : "+title+" 책저자:"+author;
    }
}
