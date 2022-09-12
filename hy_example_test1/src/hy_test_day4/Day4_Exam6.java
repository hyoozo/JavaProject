package hy_test_day4;

public class Day4_Exam6 {
    public static void main(String[] args) {

        String sat = "no news is good news";
        char n = 'n';

        int count =0;
        if(sat.length() > 50){
            return;
        }
        for(int i = 0; i<sat.length(); i++){
            if(sat.charAt(i)==n){
                count++;
            }
        }
        System.out.println(count);

    }
}
