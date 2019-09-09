package Jv_190906_16;

import java.util.Scanner;

public class Hplm {
    private static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("문자열 입력 : ");
            String str = sc.next();
            String res = hplm(str);
            System.out.println(res);
        }
        sc.close();
    }

    private static String hplm(String str) {
        int idx[] = new int[4];
        String res[] = new String[4];
        String cas[] = {"할 ", "푼 ", "리 ", "모"};

        idx[0] = str.indexOf("H");  idx[1] = str.indexOf("P");
        idx[2] = str.indexOf("L");  idx[3] = str.indexOf("M");

        for (int i = 0; i < idx.length; i++) {
            if (idx[i] > 0) res[i] = String.valueOf(str.charAt(idx[i] - 1));
            else    res[i] = "0";
        }

        str = "[";
        for (int i = 0; i < res.length; i++) {
            if(!res[i].equals("0")) str += res[i] + cas[i];
        }

        str += ("]이고, 숫자 0.");
        for (int i = 0; i < res.length; i++) {
            if (res[i] != null) str += res[i];
        }
        str += "입니다.";
        return str;
    }

    public static void main(String[] args) {
        input();
    }  
}