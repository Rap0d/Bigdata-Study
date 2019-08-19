package Jv_190819_02;

import java.util.Random;

/**
 * MyPay
 */
public class MyPay {

    public static void main(String[] args) {
        final int RATE = 5001;
        double pay = 0;
        int hours = 0;

        hours = new Random().nextInt(19)+1;

        if (hours <= 8) {
            pay += hours * RATE;
        } else {
            pay += (((hours - 8) * RATE) * 1.5) + (8 * RATE);
        }

        System.out.println(hours + "시간 근무시, 임금은 " + pay + "입니다.");
    } 
}