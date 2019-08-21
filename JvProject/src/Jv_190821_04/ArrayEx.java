package Jv_190821_04;

import java.util.Scanner;

/**
 * ArrayEx
 */
public class ArrayEx {

    public static void main(String[] args) {
        Ex01();
        celeb();
    }

    private static void celeb() {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        String tmp = "";

        System.out.print("배열의 크기는 ?");
        try {
            max = sc.nextInt();   
        } catch (Exception e) {
            System.err.println("숫자가 아니애오");
        }

        String[] celeb = new String[max];

        for (int i = 0; i < celeb.length; i++) {
            System.out.print("배열에 넣을 값을 넣어주세요 : ");
            tmp = sc.nextLine();
            celeb[i] = tmp;
        }

        // 반복문을 이용하여 요소들을 출력한다.
        for (int i = 0; i < celeb.length; i++) {
            System.out.print(celeb[i] + "\t");
        }
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