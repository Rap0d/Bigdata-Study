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
                oper(Integer.parseInt(menu));
                break;
            }
        }
    }

    private static void oper(int menu) {
        Scanner sc = new Scanner(System.in);
        switch (menu) {
        case 1:
            System.out.println("덧셈 연산입니다.\n더할 숫자의 갯수를 입력하세요.");
            break;
        case 2:
            System.out.println("뺄셈 연산입니다.\n뺄 숫자의 갯수를 입력하세요.");
            break;
        case 3:
            System.out.println("곱셈 연산입니다.\n곱할 숫자의 갯수를 입력하세요.");
            break;
        case 4:
            System.out.println("나눗셈 연산입니다.\n나눌 숫자의 갯수를 입력하세요.");
            break;
        case 5:
            System.out.println("나머지 연산입니다.\n");
            break;
        }
        int max = 0;
        if (menu != 5)
            max = sc.nextInt();
        else
            max = 2;

        int[] arr = new int[max];
        int res = 0;

        System.out.println(max + "개 입력하세요.");

        for (int i = 0; i < max; i++) {
            System.out.print((i + 1) + "번째 숫자 : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < max; i++) {
            switch (menu) {
            case 1:
                res += arr[i];
                if (i < (max - 1))
                    System.out.print(arr[i] + " + ");
                else
                    System.out.print(arr[i] + " = ");
                break;
            case 2:
                if(i != 0) res -= arr[i];
                else res += arr[i];
                if (i < (max - 1))
                    System.out.print(arr[i] + " - ");
                else
                    System.out.print(arr[i] + " = ");
                break;
            case 3:
                if(i == 0) res = 1;
                res *= arr[i];
                if (i < (max - 1))
                    System.out.print(arr[i] + " * ");
                else
                    System.out.print(arr[i] + " = ");
                break;
            case 4:
                if(i == 0) res = 1;
                res /= arr[i];
                if (i < (max - 1))
                    System.out.print(arr[i] + " / ");
                else
                    System.out.print(arr[i] + " = ");
                break;
            case 5:
                res = 1;
                res %= arr[i];
                if (i < (max - 1))
                    System.out.print(arr[i] + " % ");
                else
                    System.out.print(arr[i] + " = ");
                break;
            }

        }
        System.out.println(res);
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