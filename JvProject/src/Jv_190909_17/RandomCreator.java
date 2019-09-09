package Jv_190909_17;

import java.util.Random;

/**
 * RandomCreator
 */
public class RandomCreator extends Thread {
    @Override
    public void run() {
        Random ran = new Random();

        for(int i = 1; i <= 15; i++) {
            int rnd = ran.nextInt(100) + 1;
            System.out.println("랜덤 값 " + rnd);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}