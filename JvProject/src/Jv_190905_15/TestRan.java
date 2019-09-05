package Jv_190905_15;

/**
 * TestRan
 */
public class TestRan {

    public static void main(String[] args) {
        System.out.println(shift());
    }

    private static int shift() {
        long a = 31;
        a = a >> 5;
        return (int)a;
    }
}