package Jv_190906_16;

import java.text.DecimalFormat;

public class DecimalFormatEx {
    private static int day;
    private static int hour;
    private static int hourRes;
    private static int min;
    private static int sec;

    public static void main(String[] args) {
        // decFE(1234.56789);
        // System.out.println(adEx(2, 5));
        System.out.println(adEx2(324095));
    }



    /**
     * 
     * @param {int} sec
     * @return {String}
     */
    private static String adEx2(int sec1) {
        String tmp = null;
        String p = "0일";
        timeCalc(sec1);
        DecimalFormat df = new DecimalFormat(p);
        tmp = (sec1 + "초는 ");
        tmp += df.format(day) + " ";
        p = "00";
        df = new DecimalFormat(p);
        tmp += df.format(hourRes) + "시간 ";
        tmp += df.format(min) + "분 ";
        tmp += df.format(sec) + "초 입니다.";
        return tmp;
    }

    /**
     * 
     * @param TIME
     */
    private static void timeCalc(int TIME) {
        hour = TIME / 3600;
        day = hour / 24;
        hourRes = hour - (day * 24);
        min = (TIME - (hour * 3600)) / 60;
        sec = TIME % 60;

        System.out.println(TIME + "초는 " + day + "일 " + hourRes + "시간 " + min + "분 " + sec + "초 입니다.");
    }

    /**
     * 
     * @param {int} i
     * @param {int} j
     * @return {String}
     */
    private static String adEx(int i, int j) {
        String tmp = null;
        String p1 = "00분";
        DecimalFormat df = new DecimalFormat(p1);
        tmp = df.format(i);
        p1 = "00초";
        df = new DecimalFormat(p1);
        tmp += df.format(j);
        tmp += ".txt";
        return tmp;
    }

    /**
     * decFE
     * 
     * @param su
     */
    private static void decFE(double su) {

        // DecimalFormat : Decimal(10진수) + Format(서식)용 유틸리티 클래스
        String pattern = "###,###.00";
        DecimalFormat df1 = new DecimalFormat(pattern);
        String result = df1.format(su);
        System.out.println("결과1 : [" + result + "]");

        pattern = "000,000.00";
        df1 = new DecimalFormat(pattern);
        result = df1.format(su);
        System.out.println("결과2 : [" + result + "]");

        // 출력결과 : 001234
        DecimalFormat df = new DecimalFormat("000000");// 자릿수 지정-모자른 자릿수는 0이 대체
        int su1 = 1234;

        result = df.format(su1);
        System.out.println("결과3 : [" + result + "]");

        // 출력결과 : 001234
        DecimalFormat df2 = new DecimalFormat("#####");// 자릿수 지정-모자른 자릿수는 표시 안함
        int su2 = 1234;

        result = df2.format(su2);
        System.out.println("결과4 : [" + result + "]");

        // 출력결과 :
        DecimalFormat df3 = new DecimalFormat("000000");// 자릿수 지정-모자른 자릿수는 0이 대체
        int su3 = 123456789;

        result = df3.format(su3);
        System.out.println("결과5 : [" + result + "]");

        // 출력결과 :
        DecimalFormat df4 = new DecimalFormat("#####");// 자릿수 지정-모자른 자릿수는 표시 안함
        int su4 = 123456789;

        result = df4.format(su4);
        System.out.println("결과6 : [" + result + "]");

        // 출력결과 : [1,234]
        DecimalFormat df5 = new DecimalFormat("###,###");// (,)(.)(-)를 구분자로 사용
                                                         // 가능
        int su5 = 1234;
        result = df5.format(su5);
        System.out.println("결과7 : [" + result + "]");

        su = 0.257;
        DecimalFormat df6 = new DecimalFormat("###.0%");
        result = df6.format(su);
        System.out.println("결과8 : [" + result + "]");
    }
}
