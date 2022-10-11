package exam_collection_set;

public class Score implements Comparable<Score> {
    private int kor;
    private int math;

    public Score(int kor, int math) {
        this.kor = kor;
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public int getMath() {
        return math;
    }
    public int getSum(){
        return this.kor + this.math;
    }

    @Override
    public int compareTo(Score o) {
        int r = this.getSum() - o.getSum();
        if (r > 0) {
            return 1;
        } else if (r == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("[Score - 국어:%d, 수학:%d, 총점:%3d]",kor,math,getSum());
    }
}
