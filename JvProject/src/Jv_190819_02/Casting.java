package Jv_190819_02;

public class Casting {
    public static void main(String[] args) {
        double d = 100;
        System.out.println("d : " + d);

        int a = (int)12.5;
        System.out.println("a : " + a);

        System.out.println(14/5);
        System.out.println((double)14/5);
        System.out.println((double)(14/5));
        
        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;
        double avg = (double)total / 3;
        System.out.println("total : " + total);
        System.out.println("avg : " + avg);

        char ch1 = 'c';
        char ch2 = 'a';

        boolean b1 = ch1 > ch2;
        System.out.println(b1);

        int res = ch1 - ch2 + 3;
        System.out.println(res);

        char ch3 = 'D';
        String str = ch3 >= 'A' && ch3 <= 'Z' ? "대문자" : "소문자";
        System.out.println(str);
    }
}