package exam_class_basic;

public class Movie {
   public String movieTitle;
   public String movieGrade;
   public String moviDirector;
   public String movieYear;

    public void movieData(String title, String grade, String director, String year) {
        movieTitle = title;
        movieGrade = grade;
        moviDirector = director;
        movieYear = year;
    }
    public String toString(){
        return String.format("%s\t %s\t %-10s\t %s",movieTitle,movieGrade,moviDirector,movieYear);
    }
}
