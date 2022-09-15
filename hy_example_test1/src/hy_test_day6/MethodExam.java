package hy_test_day6;

public class MethodExam {
    public String name;
    public int kor;
    public int eng;
    public int mat;

    public void printData(){
        System.out.println(name+" "+kor+" "+eng+" "+mat);
    }

    public static void main(String[] args) {
        MethodExam meth = new MethodExam();
        meth.name = "홍길동";
        meth.eng = 90;
        meth.kor = 60;
        meth.mat = 100;
        System.out.println();
        meth.printData();

    }
}
