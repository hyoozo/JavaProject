package hy_test_day6_super;

public class Student extends Person{
    private int number;
    public Student(){

    }
    public Student(String name, int age, int number){
        super(name, age);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String show(){
        return super.show() + " 학번 : "+ number;
    }
}
