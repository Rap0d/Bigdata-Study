package Jv_190909_17;

/**
 * ThreadEx
 */
class ThreadEx extends Thread {
    public ThreadEx(String name) {
        super(name);
    }

    @Override
    public void run() {
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
class RunnableEx extends Some {

}

/**
 * Thread02
 */
public class Thread02 {

    public static void main(String[] args) {
        ThreadEx soo = new ThreadEx("철수");
        soo.start();
        new ThreadEx("영희").start();
    }
}