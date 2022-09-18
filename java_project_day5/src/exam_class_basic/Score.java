package exam_class_basic;
//성적을 출력하는 Score클래스 정의함
// 이름, 국어, 영어, 수학, 총점을 저장하고자 한다 (필드 구현)
// 필드에 값을 설정할 수 있는 기능, 점수들의 합을 구하는 기능, 평균을 구하는 기능, 학점을 구하는 기능
// 모든 필드를 출력할 수 있는 기능을 포함하도록 한다. (메서드 구현)
public class Score {
    public String name;
    public int kor;
    public int eng;
    public int math;
    public int sum;
    public double avg;

    public void scoreNum(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = this.kor + this.eng + this.math;
        this.avg = (double) this.sum/3;
    }

    public int getSum(){
        this.sum = this.kor + this.eng + this.math;
        return this.sum;
    }
    public double getAvg(){
        this.avg = (double) this.sum/3;
        return this.avg;
    }
    public String toString(){
        this.sum = this.kor + this.eng + this.math;
        this.avg = (double) (this.sum/3)*100/10.0;
//        return name+"\t" + kor+"\t\t" + eng+"\t\t" + math+"\t\t" + sum+"\t\t" + avg;

        return String.format("%s\t %d\t %d\t %d\t %d\t %.2f",name,kor,eng,math,sum,avg);
    }
}
