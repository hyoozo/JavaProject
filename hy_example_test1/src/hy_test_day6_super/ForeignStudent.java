package hy_test_day6_super;

public class ForeignStudent extends Student{
    private String nationality;  //국적
    public ForeignStudent(){

    }
    public ForeignStudent(String name, int age, int number, String nationality){
        super(name, age, number);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String show(){
       return super.show() + " 국적 : " + nationality;
    }
}
