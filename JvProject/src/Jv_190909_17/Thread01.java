package Jv_190909_17;

/**
 * Thread01
 */
public class Thread01 {

    public static void main(String[] args) {
        RandomCreator rc = new RandomCreator();
        rc.start();
        System.out.println(Thread.currentThread().activeCount());
        for (int i = 1; i <= 30; i++) {
            new UserCalender();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}