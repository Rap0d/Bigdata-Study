package Jv_190906_16;

/**
 * WrapperEx
 */
public class WrapperEx {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        int xx = 2147483647;
        System.out.println("toBinary" + Integer.toBinaryString(xx));
    }
}