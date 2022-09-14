package exam_array;

import java.util.Arrays;

//공장은 하루 8시간 가동한다.
//온도는 실시간으로 입력되지만, 여기서는 배열에 값을 저장해 놓는 것으로 대신한다.
//온도가 30도가 넘으면 에어컨을 가동 시킨다.
public class ArrayExam1 {
    public static void main(String[] args) {

        //main 메소드안에서는 자동초기화가 되지 않는다.
        //지역변수를 초기화 하기 위해서 0을 줌
        //배열값을 주면 자동 초기화됨
        int[] degree = {28,30,29,32,31,28,29,30}; //온도
        int airConditioner = 0; //에어컨 가동

        for (int num : degree) {
            if(num >= 30){
                airConditioner++;
            }
        }
        for (int i = 0; i <degree.length; i++){
            if(degree[i] >= 30){
                airConditioner++;
            }
        } //위에랑 같은 방법

        System.out.printf("에어컨은 총 %d시간 동안 가동되었다. \n",airConditioner);

    }
}

