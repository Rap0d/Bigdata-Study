package Jv_190909_17;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * ThreadEx
 */
class ThreadEx extends Thread {
    public ThreadEx(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Date date = new Date();
            String pattern = "hh:mm:ss";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            String now = sdf.format(date);
            System.out.println(super.getName() + " Thread Current Time :" + now);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * Some
 */
class Some {

}

/**
 * RunnableEx
 */
class RunnableEx extends Some implements Runnable {

    @Override
    public void run() {
        String[] arr = { "가", "나", "다", "라" };

        for (int i = 1; i <= 100; i++) {
            String item = arr[new Random().nextInt(arr.length)];
            System.out.println("배열 요소 출력 : " + item);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

/**
 * Thread02
 */
public class Thread02 {

    public static void main(String[] args) {
        ThreadEx soo = new ThreadEx("철수");
        soo.start();
        new ThreadEx("영희").start();
        RunnableEx mrun = new RunnableEx();
        Thread th2 = new Thread(mrun);
        th2.start();
        th2.interrupt();
    }
}