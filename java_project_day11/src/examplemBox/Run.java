package examplemBox;

import examplemBox.Money;

public class Run {
    public static void main(String[] args) {
//        Money m = new Money(1120000);
////        m.setMoney(10000);
//        m.print();
//        System.out.println(Money.getUnit());

//        String[] sArr = {"빨강", "노랑", "파랑"};
//        for (int i = 0; i < sArr.length; i++) {
//            System.out.println(sArr[i]);
//        }
//        double[] dArr = new double[5];
//        dArr[0] = 0.0;
//        System.out.println(dArr[0]);
        String[] sArr = new String[3];

        System.out.println(sArr);

        System.out.println(sArr[0]);
    }
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
