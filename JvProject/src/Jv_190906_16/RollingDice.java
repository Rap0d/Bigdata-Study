package Jv_190906_16;

import java.util.Random;

/**
 * RollingDice
 */
public class RollingDice {
    private static void ranDice(int dice, int face) {
        // Parameter : Dice count and face of dice
        int cnt = 0;
        int lottery[] = new int[dice];
        boolean chk[] = new boolean[dice-1];

        while (true) {
            for (int i = 0; i < lottery.length; i++) {
                lottery[i] = new Random().nextInt(face) + 1;
            }

            for (int i = 1; i < lottery.length; i++) {
                if (lottery[0] == lottery[i]) {
                    chk[i-1] = true;
                } else {
                    chk[i-1] = false;
                }
            }

            int chkInt = 0;
            for(int i = 0; i < chk.length; i++) {
                if(chk[i] == true) {
                    chkInt++;
                }
            }

            cnt++;

            if (cnt % 10000 == 0) {
                System.out.println(cnt + "번 돌아가는중 ..");
            }
            if(chkInt == chk.length) {
                break;
            }
        }
        System.out.println(lottery[0] + "으로 " + cnt + "번 만에 성공!");
    }

    public static void main(String[] args) {
        ranDice(20, 6);
    }
}