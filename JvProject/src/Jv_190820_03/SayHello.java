package Jv_190820_03;

/**
 * SayHello
 */
public class SayHello {

    public static void main(String[] args) {
        String str = "Hi~";

        for (int i = 0; i < 10; i++) {
            PrintMethod01(str);
        }
    }

    private static void PrintMethod01(String str) {
        System.out.println(str);
    }
}