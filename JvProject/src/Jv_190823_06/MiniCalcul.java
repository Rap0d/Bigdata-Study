package Jv_190823_06;

import java.util.Scanner;

/**
 * MiniCalcul
 */
public class MiniCalcul {

    public static void main(String[] args) {
        app();
    }

    private static void app() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "--------------------\n    초간단 계산기\n--------------------\n1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 나머지\n0. 종료\n");
            String menu = sc.nextLine();
            if (menu.equals("0"))
                break;

            switch (valid(menu)) {
            case 0:
                System.out.println("숫자만 입력하세요.");
                break;
            case 1:
                System.out.println("범위에 알맞은 메뉴를 선택하세요.");
                break;
            case 2:
                System.out.println("종료합니다.");
                break;
            case 3:
                switch (Integer.parseInt(menu)) {
                case 1:
                    plus();
                    break;
                case 2:
                    minu();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    divi();
                    break;
                case 5:
                    minu();
                    break;
                }
                break;
            }
        }
        sc.close();
    }

    private static void divi() {
    }

    private static void mult() {
    }

    private static void minu() {
    }

    private static void plus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("더하기 연산입니다.\n더할 숫자의 갯수를 입력하세요.");
        int max = sc.nextInt();
        int[] arr = new int[max];
        System.out.println(max + "개 입력하세요.");
        for (int i = 0; i < max; i++) {
            System.out.print(i + "번째 숫자 : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < max; i++) {
            if(i < (max-1)) System.out.print(arr[i] + " + ");
            else System.out.print(arr[i] + " = ");
        }
        for (int i = 0; i < max; i++) {
            
        }
        sc.close();
    }

    private static int valid(String menu) {
        if (!isNumeric(menu)) {
            return 0;
        } else {
            int menuI = Integer.parseInt(menu);
            if (menuI < 0 || menuI > 5) {
                return 1;
            } else if (menuI == 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}