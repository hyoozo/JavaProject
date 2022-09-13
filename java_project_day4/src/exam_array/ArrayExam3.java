package exam_array;
//1차원 배열 기초
//20명의 학생에게 만족도 조사
//만족도별 응답 횟수를 출력하세요.

public class ArrayExam3 {

    public static void main(String[] args) {
        int[] survey = {1, 2, 1, 2, 3, 1, 2, 2, 3, 1, 3, 3, 1, 1, 1, 2, 3, 1, 3, 2};
        int good = 0;
        int normal = 0;
        int bad = 0;

        for(int i = 0; i < survey.length; i++){
            switch (survey[i]){
                case 1:
                    bad++;
                    break;
                case 2:
                    normal++;
                    break;
                case 3:
                    good++;
                    break;
            }
        }
        System.out.printf("불만족 : %d 보통 : %d 만족 : %d",bad,normal,good);

    }
}
