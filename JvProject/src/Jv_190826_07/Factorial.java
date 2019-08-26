package Jv_190826_07;

import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[2];
        for (int i = 0; i < 1; i++) {
            System.out.println("숫자 입력하세요.");
            arr[i] = sc.nextInt();
        }
        System.out.println(Ex01(arr[0]));
        System.out.println(Ex02(arr[0]));
    }

    private static int Ex02(int arr) {
        if(arr == 1) {
            return 1;
        } else {
            return arr + Ex01(--arr);
        }
    }

    private static int Ex01(int arr) {
        if(arr == 1) {
            return 1;
        } else {
            return arr * Ex01(--arr);
        }
    }
}