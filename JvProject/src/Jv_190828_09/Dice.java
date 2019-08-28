package Jv_190828_09;

import java.util.Random;

/**
 * Dice
 */
public class Dice {
    private final int DICE_SIDE = 6;
    private String name;
    private int time;
    private int di[];
    private int total;

    int[] roll() {
        di = new int[time];
        for (int i = 0; i < time; i++) {
            di[i] = new Random().nextInt(DICE_SIDE) + 1;
        }
        return di;
    }

    void total() {
        for (int i = 0; i < di.length; i++) {
            total += di[i];
       }
    }

    void getInfo() {
        System.out.println("이름 : " + name);
        System.out.print("주사위 값 : ");
        for (int i = 0; i < di.length; i++) {
             System.out.print(di[i] + " ");
        }
        this.total();
        System.out.println("\n합계 : " + total);
    }

    public Dice(String name, int time) {
        this.name = name;
        this.time = time;
        this.roll();
    }
}