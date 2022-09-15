package exam_class_basic;

public class Movie {
    String title;
    String director;
    int date;
    String genre;


    public void movieMethod(String title, String director, int date, String genre){
        System.out.println("영화제목: "+title+" 감독: "+director+" 개봉일: "+date+" 장르:"+genre);
    }
    public void moviePrint(){
        System.out.println("영화제목: "+this.title+" 감독: "+this.director+" 개봉일: "+this.date+" 장르:"+this.genre);
    }
    public String toString(){
        return "영화제목: "+title+" 감독: "+director+" 개봉일: "+date+" 장르:"+genre;
    }
}
