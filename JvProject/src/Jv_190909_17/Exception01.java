package Jv_190909_17;

/**
 * Exception01
 */
public class Exception01 {

    public static void main(String[] args) {
        String str = "hello Korea";
        int idx = str.indexOf(str);

        try {
            String tmp = str.substring(0, idx);
            System.out.println(tmp);
        } catch (StringIndexOutOfBoundsException e) {
            idx = str.indexOf(str) - 1;
        } finally {
            System.out.println("Finally");
        }
    }
}