package Jv_190819_02;

import java.util.Random;

/**
 * MyPay
 */
public class MyPay {

    public static void main(String[] args) {
        Pay();
    }

    private static void Pay() {
        Pay2();
    }

	private static void Pay2() {
		final int RATE = 5000;
        double pay = 0;
        int hours = 0;

        hours = new Random().nextInt(19)+1;

        if (hours <= 10) {
            pay += hours * RATE;
        } else if(hours > 10 && hours <= 20) {
            pay += (((hours - 10) * RATE) * 1.5) + (10 * RATE);
        } else if(hours > 20) {
            pay += (((hours - 20) * RATE) * 2) + (20 * RATE);
        }

        System.out.println(hours + "시간 근무시, 임금은 " + pay + "입니다.");
	} 
}