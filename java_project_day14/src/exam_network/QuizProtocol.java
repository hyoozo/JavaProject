package exam_network;

public class QuizProtocol {
    private static final int WAITING = 0;
    private static final int PROBLEM = 1;
    private static final int ANSWER = 2;

    private static final int NUMPROBLEMS = 3;

    private int state = WAITING;
    private int currentProble = 0;

    private String[] problems = {"계란을 팔아서 번 돈은?","세상에서 가장 뜨거운 통화는?","꽃가게 주인이 싫어하는 나라는?"};
    private String[] answers = {"에그머니", "화상통화", "시드니"};

    public String process(String theInput) {
        String thOutput = null;

        if (state == WAITING) {
            thOutput = "퀴즈를 시작합니다(y/n)";
            state = PROBLEM;
        } else if (state == PROBLEM) {
            if (theInput.equalsIgnoreCase("y")) {
                thOutput = problems[currentProble];
                state = ANSWER;
            } else {
                state = WAITING;
                theInput = "quit";
            }
        } else if (state == ANSWER) {
            if (theInput.equalsIgnoreCase(answers[currentProble])) {
                thOutput = "정답입니다. 계속하시겠습니까? (y/n)";
                state = PROBLEM;
            } else {
                state = PROBLEM;
                thOutput = "오답입니다. 계속하시겠습니까? (y/n)";
            }
            currentProble = (currentProble +1)% NUMPROBLEMS;
        }
        return thOutput;
    }

}
