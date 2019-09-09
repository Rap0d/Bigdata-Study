package Jv_190909_17;

/**
 * MyExceptionEx01
 */
public class MyExceptionEx01 {

    public static void main(String[] args) {
        int x = 3, y = 0;
        int arr[] = {10, 20, 30};

        try {
            arr[3] = 50;
            System.out.println(x / y);
            try {
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(-1);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("배열 첨자 예외");
        } finally {
            System.out.println("finally");
        }
        
    }
}