package exam_class_basic;

public class Movie {
    String title;
    String director;
    int date;
    String genre;

    public void movieMethod(String a, String b, int c, String d){
        title = a;
        director =b;
        date = c;
        genre = d;
        System.out.println("영화제목: "+a+" 감독: "+b+" 개봉일: "+c+" 장르:"+d);
    }
}
