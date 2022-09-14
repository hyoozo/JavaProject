package exam_array_in_array;

import java.lang.reflect.Array;
import java.util.Arrays;

//3년(2018~2020)동안의 계절별 (분기별) 강수량 데이터를 활용하여 연도별 강수량과 합꼐를 출력하는 프로그램
public class ArrayExam {
    public static void main(String[] args) {
        final int YEARS = 3; //3년
        final int QUARTERS = 5; //4분기 + 총함
        //기상청 데이터를 활용하여 2차원 배열 초기화
        double[][] rain = {{368.1, 586.5, 351.2, 66.5, 0},{173.9,493.0,448.4,168.1, 0},{172.8,1012.4,259.4,46.7, 0}};

        for(int i = 0; i < YEARS; i++){
                for(int j = 0; j <QUARTERS-1; j++){
                    rain[i][QUARTERS-1] += rain[i][j];
                    //rain[y][QUARTERS-1] = rain[y][QUARTERS-1]+rain[y][q];
                    //rain[행][열 마지막 인덱스] = rain[행][열 마지막인덱스] + 분기별 강수량;
                    //rain[행][4] = rain[행][4]+분기별 강수량;
                }
            }
        String[] year = {"2018", "2019", "2020"};
        System.out.println("년도\t\t1분기\t2분기\t3분기\t4분기\t총합");
        System.out.println("-----------------------------------------------------");
        for (int y = 0; y <YEARS; y++){
            System.out.print(year[y]+"년도\t");
            for (int q = 0; q < QUARTERS; q++){
                System.out.printf("%.1f\t",rain[y][q]);
            }
            System.out.println();
        }
    }
}
