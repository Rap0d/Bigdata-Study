package Jv_190819_02;

import java.util.Random;

public class If01 {
    public static void main(String[] args) {
        // If1();
        If02();
        LargeTest();
    }

    // private static void If1() {
    //     Random ran = new Random();
    //     int su = ran.nextInt(200);
    //     if (su % 2 == 0) {
    //         System.out.println(su + "는 짝수");
    //     }
    // }

    private static void If02() {
        Random ran = new Random();
        int su = ran.nextInt(200);

        System.out.println("{");
        if (su%2 == 0) {
            System.out.println(su + "는 짝수");
        }
        else {
            System.out.println(su + "는 홀수");
        }

        if (su%3 == 0) {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("}");
    }

    private static void LargeTest() {
        Random ran = new Random();
        int su1 = ran.nextInt(200);
        int su2 = ran.nextInt(200);

        if (su1 > su2) {
            System.out.println(su2 + "보다 " + su1 + "가 더 크다.");
        }
        else if (su1 == su2) {
            System.out.println("같다.");
        }
        else {
            System.out.println(su1 + "보다 " + su2 + "가 더 크다.");
        }
    }
}