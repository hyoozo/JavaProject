package exam_class_array_scoreOX;

// 1~5번의 입력 답 dap[]
// 답의 개수를 체크하는 cnt를 이용하여 점수를 매기고 맞는 전체 개수를 체크하는 static 변수인 tot를 이용한다.
//생성자를 이용하여 번호, 이름, 답을 받아 객체를 생성하고 compute() 메서드에서는 정답 {1,1,1,1,1}과 입력한 데이터가 맞으면
// 전체 개수를 체크하여 display() 메서드로 각 내용을 출력한다.
// static 메서드인 ranking()메서드에서는 5명의 ScoreOX의 객체를 배열로 받아 순위를 구한다.
public class ScoreOX {
    private int no; //번호
    private String name; //이름
    private int[] dap = new int[5]; //답
    private int cnt; // 답의 개수를 체크하는
    private int score; //점수
    private int rank; //등수
    private char[] c_ox = new char[5];  //o, x
    public static int tot; //전체 동그라미갯정

    public ScoreOX(){  //기본생성자

    }
    public ScoreOX(int no, String name, int[] dap){  //매개변수 3개
        this.no = no;
        this.name = name;
        this.dap = dap;
    }
    public void compute(){//정답 {1,1,1,1,1}과 입력한 데이터가 맞으면 개수와 전체 개수 체크
        int[] answer = {1,1,1,1,1};
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == this.dap[i]){
                this.c_ox[i] = 'o';
                this.cnt++;
            } else {
                this.c_ox[i] = 'x';
            }
        }
        this.score = this.cnt * 20;
        this.tot += this.cnt;
    }
    public void display(){   //compute 내용 출력
        System.out.printf("%3s%8s",this.no,this.name);
        for (int i = 0; i < this.c_ox.length; i++) {
            System.out.printf("%9s",this.c_ox[i]);
        }
        System.out.printf("%10d",this.score);
        System.out.printf("%10d\n",(this.rank+1));

    }
    public static void ranking(ScoreOX[] sc){  //5명의 ScoreOX의 객체를 배열로 받아서 순위구하기
        int rankPoint = 0;
         for (int i = 0; i < sc.length; i++) {
             if (i == sc.length -1) {
                 break;
             } else {
                 for (int j = i + 1; j < sc.length; j++) {
                     if (sc[i].getScore() > sc[j].getScore()) {
                         rankPoint = sc[j].getRank();
                         rankPoint++;
                         sc[j].setRank(rankPoint);
                     } else if (sc[i].getScore() < sc[j].getScore()) {
                         rankPoint = sc[i].getRank();
                         rankPoint++;
                         sc[i].setRank(rankPoint);
                     }
                 }
             }
         }
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }
}
