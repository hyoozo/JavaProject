package exam_class_array_scoreOX;

import java.util.Objects;

// 1~5번의 입력 답 dap[]
// 답의 개수를 체크하는 cnt를 이용하여 점수를 매기고 맞는 전체 개수를 체크하는 static 변수인 tot를 이용한다.
//생성자를 이용하여 번호, 이름, 답을 받아 객체를 생성하고 compute() 메서드에서는 정답 {1,1,1,1,1}과 입력한 데이터가 맞으면
// 전체 개수를 체크하여 display() 메서드로 각 내용을 출력한다.
// static 메서드인 ranking()메서드에서는 5명의 ScoreOX의 객체를 배열로 받아 순위를 구한다.
public class ScoreOX {
    private int no; //번호
    private String name; //이름
    private int[] dap; //답
    private int score; //점수
    private int rank; //등수
    private char c_ox;  //o, x
    public static int tot; //전체개수체

    public ScoreOX(){  //기본생성자

    }
    public ScoreOX(int no, String name, int[] dap){  //매개변수 3개
        this.no = no;
        this.name = name;
        this.dap = dap;
    }
    public void compute(){//정답 {1,1,1,1,1}과 입력한 데이터가 맞으면 개수ㅘ 전체 개수 체크

        return;
    }
    public void display(){   //compute 내용 출력
        return;

    }
    public static void ranking(ScoreOX[] sc){  //5명의 ScoreOX의 객체를 배열로 받아서 순위구하기
         ScoreOX[] scoreOX = new ScoreOX[5];


        return;

    }

}
