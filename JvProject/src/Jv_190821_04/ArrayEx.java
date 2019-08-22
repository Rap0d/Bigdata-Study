package Jv_190821_04;

import java.util.Random;
import java.util.Scanner;

/**
 * ArrayEx
 */
public class ArrayEx {

    public static void main(String[] args) {
        // Ex01();
        // celeb();
        // Ex02();
        Ex03();
    }

    private static void Ex03() {
        int max = 5;
        int[] arr = new int[max];

        Scanner sc = new Scanner(System.in);

        int odd = 0, even = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("입력하세요 : ");
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0)
            even += arr[i];
            else
            odd += arr[i];
        }

        System.out.println("even : " + even + ", odd : " + odd);
    }

    private static void Ex02() {
        int[] ar = new int[5];
        int total = 0;

        for(int i = 0; i < ar.length; i++) {
            ar[i] = new Random().nextInt(3) + 3;
        }
        for (int i : ar) {
            total += i;
            System.out.println("i : " + i);
        }

        System.out.println("total : " + total);
    }

    private static void celeb() {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        double tmp;
        double total = 0.0;

        System.out.print("배열의 크기는 ? ");
        try {
            max = sc.nextInt();   
        } catch (Exception e) {
            System.err.println("숫자가 아니애오");
        }

        Double[] celeb = new Double[max];

        for (int i = 0; i < celeb.length; i++) {
            System.out.print("배열에 넣을 점수를 넣어주세요 : ");
            tmp = sc.nextDouble();
            celeb[i] = tmp;
        }

        System.out.println("---------------------------------------------------------------");

        // 반복문을 이용하여 요소들을 출력한다.
        for (int i = 0; i < celeb.length; i++) {
            System.out.print(celeb[i] + "\t");
            total += celeb[i];
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("total : " + total + ", Avg : " + total / max);
        sc.close();
    }

    private static void Ex01() {
        int x = 3;
        int y = 5;

        int[] arr = new int[3];

        arr[0] = x - y + 6; // 3 - 5 + 6 = 4
        arr[2] = arr[0] + 3; // 4 + 3 = 7
        arr[1] = arr[0] + arr[2]; // 4 + 7 = 11

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int[] arr2 = { 10, 20, 30 };

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}