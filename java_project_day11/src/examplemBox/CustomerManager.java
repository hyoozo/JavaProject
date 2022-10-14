package examplemBox;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        HashMap<String, CustomerManager> membership = new HashMap<>();
        CustomerManager custom = new CustomerManager();
        HashMap<String, Integer> membership = new HashMap<>();

        System.out.println(" ** 포인트 관리 프로그램입니다. ** ");

        System.out.print("이름과 포인트 입력 >>  ");
        String name = sc.nextLine();
        int point = sc.nextInt();
//        membership.put(name,new CustomerManager(point));
        membership.put(name, point);
        System.out.println(membership); //{asdf=1}



        System.out.println();

    }

    private int point;
    public CustomerManager(){

    }
    public CustomerManager(int point) {

    this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
