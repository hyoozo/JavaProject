package exam_method.exam_class_constructor;

public class BookTest {
    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자","생텍쥐페리");
        Book loverStory = new Book("춘향전");

        System.out.println(littlePrince.title+"  "+littlePrince.author);
        System.out.println(loverStory.title+"   "+loverStory.author);

        System.out.println(littlePrince.toString());
        System.out.println(loverStory.toString());
    }
}
