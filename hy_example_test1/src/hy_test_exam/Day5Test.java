package hy_test_exam;

public class Day5Test {
    public static void main(String[] args) {


    int[][] arr = new int[10][10];

    //각각의 가로, 세로, 대각선의 합을 저장할 변수 목록
    int[] horizonTotalArr = new int[arr.length];
    int[] verticalTotalArr = new int[arr.length];
    int rightDiagonal = 0;
    int leftDiagonal = 0;

    //난수를 2차원 배열에 저장
        for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            arr[i][j] =(int)(Math.random()*100);
        }
    }

    //생성된 2차원 배열 출력
        System.out.println("생성된 2차원 배열");
        for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            System.out.print(arr[i][j] +"\t");
        }
        System.out.println();
    }

    // 가로, 세로, 대각선의 합계 구하기
        for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            // 왼쪽 대각선
            if(i == j){
                leftDiagonal += arr[i][j];
            }

            if(i+j == arr.length-1){
                rightDiagonal += arr[j][i];
            }

            horizonTotalArr[i] += arr[i][j]; //가로 길이 합
            verticalTotalArr[i] += arr[j][i]; //세로 길이 합
        }
    }
    // 결과값 출력
        System.out.println("결과값 출력");
        for(int i=0; i<horizonTotalArr.length; i++){
        System.out.printf("\n %d번째 가로길이 합 : %d", i+1, horizonTotalArr[i]);
    }
        System.out.println("\n---------------------------------------------------");
        for(int i=0; i<horizonTotalArr.length; i++){
        System.out.printf("\n %d번째 세로길이 합 : %d", i+1, verticalTotalArr[i]);
    }
        System.out.println("\n---------------------------------------------------");
        System.out.printf("\n 오른쪽 대각선 길이 합 : %d", rightDiagonal);
        System.out.printf("\n 왼쪽 대각선 길이 합 : %d", leftDiagonal);
}
}
