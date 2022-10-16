package examplemBox;

import java.util.*;

public class CustomerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> custmor = new HashMap<>();

        System.out.println(" ** 포인트 관리 프로그램입니다. ** ");

        while (true) {
            System.out.print("이름 >>  ");
            String name = sc.nextLine();
                if (name.equals("종료")) {
                    System.out.println("프로그램 종료합니다.");
                    break;
                }

            System.out.print("포인트 >> ");
            int point = sc.nextInt();
//            custmor.put(name, point);
            sc.nextLine();

            //이름이 같을시 포인트 저장
            if (custmor.containsKey(name)) {
                custmor.put(name, custmor.get(name) + point);
            } else {
                custmor.put(name, point);
            }

            //전체 내용 출력
            Set<String> keys = custmor.keySet();
            Iterator<String> iter = keys.iterator();
            while (iter.hasNext()) {
                String key = iter.next();
                int value = custmor.get(key);
                System.out.print("("+key+","+value+") ");
            }
            System.out.println();


        }
    }
}
