package Jv_190909_17;

import java.util.Random;
import java.util.Scanner;

/**
 * Lotto
 */
public class Lotto {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            setLotto();
        }
    }

    private static void setLotto() {
        int[] lot = new int[6];
        Scanner sc = new Scanner(System.in);
        int[] res = new int[6];
        int cnt = 0;
        while (true) {

            boolean chkRan = false;
            int tmp = 0;
            tmp = new Random().nextInt(45) + 1;

            for (int i = 0; i < res.length; i++) {
                if (res[i] == tmp) {
                    // System.out.println(res[i] + "이 " + tmp + "과 같아 중복발생");
                    chkRan = true;
                }
            }
            if (chkRan == true)
                continue;
            else {
                chkRan = false;
            }

            res[cnt] = tmp;
            cnt++;
            if (cnt == 6)
                break;
        }
        System.out.print("당첨 번호 :\t");
        for (int lott : res) {
            System.out.print(lott + "\t");
        }
        System.out.println();
        /*
        System.out.println("\n로또");
        int tmp = 0;
        int set = 2;
        int[][] inputSet = new int[6][set];
        for (int i = 0; i < set; i++) {
            cnt = 0;
            while (true) {
                System.out.print((cnt + 1) + "번째 로또 번호를 입력하세요.");
                try {
                    inputSet[cnt][i] = sc.nextInt();
                    cnt++;
                } catch (Exception e) {
                    System.out.println("잘못 입력했습니다.");
                    continue;
                }
                if (cnt == 6)
                    break;
            }
        }

        for (int i = 0; i < set; i++) {
            System.out.print(i + 1 + "번째 set : ");
            for (int j = 0; j < 6; j++) {
                System.out.print(inputSet[j][i] + "\t");
            }
            System.out.println();
        }
        */
    }
}

class IsValid extends Exception {
    private String msg = "잘못된 로또번호 입니다.";

    public IsValid(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}