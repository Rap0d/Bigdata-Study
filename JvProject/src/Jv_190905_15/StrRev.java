package Jv_190905_15;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * StrRev
 */
public class StrRev {
    public static void main(String[] args) {
        // korOp();
        // chkEm();
        ranDice();
        // calen();
    }

    private static void calen() {
        String today = "20190905";

        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String imsi = "지금은 " + year + "년 " + month + "월 " + day + "일 ";
        System.out.println(imsi);
    }

    private static void ranDice() {
        int cnt = 0;
        int lottery[] = new int[6];
        while (true) {
            for(int i = 0; i < lottery.length; i++) {
                lottery[i] = new Random().nextInt(30) + 1;
            }

            if(lottery[0] == lottery[1] && lottery[0] == lottery[2]
            && lottery[0] == lottery[3] && lottery[0] == lottery[4]
            && lottery[0] == lottery[5]) {
                break;
            }

            if(cnt % 10000 == 0)
                System.out.println(cnt + "번 돌아가는중 ..");
            
            cnt++;
        }
        System.out.println(lottery[0] + "으로 " + (cnt-1) + "번 만에 성공!");
    }

    private static void chkEm() {
        String str = "          chang@naver.com            ";
        String id = "";
        String dom = "";
        String com = "";

        str = str.trim();

        int idx1 = str.indexOf("@");
        int idx2 = str.indexOf(".");
        System.out.println(idx1);

        for (int i = 0; i < idx1; i++) {
            id += str.charAt(i);
        }

        for (int i = idx1 + 1; i < idx2; i++) {
            dom += str.charAt(i);
        }

        for (int i = idx2 + 1; i < str.length(); i++) {
            com += str.charAt(i);
        }

        System.out.println("id : " + id + ", domain : " + dom + ", company : " + com);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, str.length()));
        }
    }

    private static void korOp() {
        String kor = "Korea";

        String res = kor.toUpperCase();
        System.out.println("대문자 : " + res);

        int len = kor.length();
        System.out.println("글자 수 : " + len);

        String res1 = "";
        len--;
        for (int i = len; i >= 0; i--) {
            System.out.println(res.charAt(i));
            res1 += res.charAt(i);
        }
        System.out.println("최종 : " + res1);
    }
}