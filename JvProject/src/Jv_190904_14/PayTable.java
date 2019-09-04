package Jv_190904_14;

/**
 * PayTable
 */
public class PayTable {
    public static void main(String[] args) {
        pt();
    }

    private static void pt() {
        MySalary[] ms = new MySalary[3];
        ms[0] = new MySalary("소서노", 750000, 2, 3);
        ms[1] = new MySalary("고주몽", 800000, 1, 4);
        ms[2] = new MySalary("모팔모", 650000, 6, 2);

        MySalary.incen = 0.7;

        System.out.println("이름" + "\t\t" + "기본급" + "\t\t" + "가족수"
        + "\t\t" + "가족수당" + "\t" + "시간외근무" + "\t" + "시간외수당"
        + "\t" + "세금" + "\t\t" + "인센티브" + "\t" + "성과금" + "\t\t" + "실수령액");

        for (int i = 0; i < ms.length; i++) {
            ms[i].clac();
            ms[i].out();
        }
    }
}