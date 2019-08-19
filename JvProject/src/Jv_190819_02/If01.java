package Jv_190819_02;

import java.util.Random;

public class If01 {
    public static void main(String[] args) {
        // If1();
        If02();
        LargeTest();
        AdultCheck();
        Logical01();
        Exam3();
        if5();
        Dice();
    }

    // private static void If1() {
    // Random ran = new Random();
    // int su = ran.nextInt(200);
    // if (su % 2 == 0) {
    // System.out.println(su + "는 짝수");
    // }
    // }

    private static void Dice() {
        int res = 0;
        int dice = 0;

        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();

        for (int i = 1; i < 5000; i++) {
            dice = new Random().nextInt(5) + 1;
            // System.out.println("Dice : " + dice);
            if (dice == 1 || dice == 4)
                res += 100;
            else if (dice == 2 || dice == 5)
                res += 200;
            else if (dice == 3 || dice == 6)
                res += 300;
        }

        end = System.currentTimeMillis();

        System.out.println("Result : " + res + ", time : " + (end - start) / 1000.0 + "초");
    }

    private static void If02() {
        Random ran = new Random();
        int su = ran.nextInt(200);

        System.out.println("{");
        if (su % 2 == 0) {
            System.out.println(su + "는 짝수");
        } else {
            System.out.println(su + "는 홀수");
        }

        if (su % 3 == 0) {
            System.out.println("3의 배수");
        } else {
            System.out.println("3의 배수가 아님");
        }
        if ((su % 3 == 0) && (su % 5 == 0)) {
            System.out.println("15의 배수");
        } else if ((su % 3 == 0) || (su % 5 == 0)) {
            System.out.println("3이나 5의 배수임");
        } else {
            System.out.println("3과 5의 배수가 아님");
        }
        System.out.println("}");
    }

    private static void LargeTest() {
        Random ran = new Random();
        int su1 = ran.nextInt(200);
        int su2 = ran.nextInt(200);

        if (su1 > su2) {
            System.out.println(su2 + "보다 " + su1 + "가 더 크다.");
        } else if (su1 == su2) {
            System.out.println("같다.");
        } else {
            System.out.println(su1 + "보다 " + su2 + "가 더 크다.");
        }
    }

    private static void AdultCheck() {
        String name = "홍길동";
        int age = new Random().nextInt(80);

        if (age > 19) {
            System.out.println(name + "님은 " + age + "살으로 성인입니다.");
        } else {
            System.out.println(name + "님은 " + age + "살으로 애기입니다.");
        }
    }

    private static void Logical01() {
        double ran = Math.random();
        int month = (int) (ran * 12) + 1;

        System.out.print(month + "월은 ");
        if (month >= 3 && month <= 5)
            System.out.println("봄");
        else if (month > 5 && month < 9)
            System.out.println("여름");
        else if (month >= 9 && month <= 11)
            System.out.println("가을");
        else
            System.out.println("겨울");
    }

    private static void Exam3() {
        double ran = Math.random();
        int seed = 50;
        int su = (int) (ran * seed) - (seed / 2);
        System.out.println("5의 배수 고르기");
        if (su < 0) {
            if (su % 5 == 0)
                System.out.println(su + "은 5의 배수");
            else
                System.out.println(su + "는 그냥 음수");
        } else if (su == 0) {
            System.out.println("0");
        } else {
            if (su % 5 == 0)
                System.out.println(su + "은 5의 배수");
            else
                System.out.println(su + "는 그냥 양수");
        }
    }

    private static void if5() {
        int i = 1;

        while (true) {

            if (i >= 91 && i <= 96) {
                i++;
                continue;
            }

            if (i >= (int) 'A' && i <= (int) 'Z') {
                System.out.println(i + " : 대문자 " + (char) i);
            } else if (i >= (int) 'a' && i <= (int) 'z') {
                System.out.println(i + " : 소문자 " + (char) i);
            }
            i++;

            if ((char) i == 'z') {
                System.out.println(i + " : 소문자 " + (char) i);
                break;
            }
        }

        String str = "Korea2002";

        int len = str.length();
        System.out.println("문자열 길이 : " + len);

        char ch = str.charAt(7);
        System.out.println("2번째 글자 : " + ch);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("대문자");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("소문자");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("숫자");
        } else {
            System.out.println("기타 문자");
        }

        String upper = str.toUpperCase();
        System.out.println("대문자로 변경 : " + upper);

        System.out.println("소문자로 변경 : " + str.toLowerCase());
    }
}