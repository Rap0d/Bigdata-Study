package Jv_190905_15;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat
 */
public class DateFormat {

    public static void main(String[] args) {
        ThreadWithClass th1 = new ThreadWithClass();
        Thread t2 = new Thread(new ThreadWithRunnable());
        th1.start();
        t2.start();
    }

    public static void getDate01() {
        Date date = new Date();
        System.out.println(date);

        String format = "hh시 mm분 ss초";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String now = sdf.format(date);
        System.out.println(now);
    }
}

class ThreadWithClass extends Thread {
    public void run() {
        while (true) {
            System.out.println(getName());
            DateFormat.getDate01();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

    }

}