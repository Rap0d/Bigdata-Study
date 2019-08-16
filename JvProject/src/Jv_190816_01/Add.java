package Jv_190816_01;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y, z;
        // System.out.print("num : ");
        // x = sc.nextInt();
        x = 3;
        y = 5;

        z = x + y;

        System.out.println(x + " 더하기 " + y + " 는 " + z + " 입니다.");

        x = 5;
        y = 4;
        z = x * y;

        System.out.println(x + " 곱하기 " + y + " 는 " + z + " 입니다.");

        x = 3;
        y = 5;
        z = 2 * x + 3 * y - 2;

        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("z : " + z);
        sc.close();
    }
}