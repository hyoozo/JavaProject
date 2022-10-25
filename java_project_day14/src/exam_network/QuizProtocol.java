package exam_network;

public class QuizProtocol {
    private static final int WAITING = 0;
    private static final int PROBLEM = 1;
    private static final int ANSWER = 2;

    private static final int NUMPROBLEMS = 3; //0,1,2, 를 반복?

    private int state = WAITING; // 지금의 상태
    private int currentProble = 0;

    private String[] problems = {"계란을 팔아서 번 돈은?","세상에서 가장 뜨거운 통화는?","꽃가게 주인이 싫어하는 나라는?"};
    private String[] answers = {"에그머니", "화상통화", "시드니"};

    public String process(String theInput) {
        String theOutput = null;

        if (state == WAITING) {
            theOutput = "퀴즈를 시작합니다(y/n)";
            state = PROBLEM;
        } else if (state == PROBLEM) {
            if (theInput.equalsIgnoreCase("y")) {
                theOutput = problems[currentProble];  //문제 [0] 번째 꺼내와서 담는다.
                state = ANSWER;
            } else {
                state = WAITING;
                theOutput = "quit";
            }
        } else if (state == ANSWER) {
            if (theInput.equalsIgnoreCase(answers[currentProble])) {
                theOutput = "정답입니다. 계속하시겠습니까? (y/n)";
                state = PROBLEM;
            } else {
                state = PROBLEM;
                theOutput = "오답입니다. 계속하시겠습니까? (y/n)";
            }
            currentProble = (currentProble +1)% NUMPROBLEMS; //y 라고 했을때 [1]이 되고 [2]가 되고
                                                                // % NUMPROBLEMS 3문제에서 나머지구하기.
                                                                // 0,1,2 만 반복..
        }
        return theOutput;
    }

}
