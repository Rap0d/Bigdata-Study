package Jv_190823_06;

/**
 * MethodEx
 */
public class MethodEx {

    public static void main(String[] args) {
        // Ex01();
        Ex02();
    }

    private static void Ex02() {
        int x = 3;
        gugudan(x);
        System.out.println();
        gugudan(x, 5);
    }

    private static void gugudan(int start, int end) {

        System.out.println(start + "단부터 " + end + "단까지 출력합니다.");
        for (int i = start; i <= end; i++) {
            for (int k = 1; k <= 9; k++) {
                String imsi = i + " * " + k + " = " + (i * k) + "\t";
                System.out.print(imsi);
            }
            System.out.println();
        }
    }

    private static void gugudan(int dan) {
        System.out.println(dan + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            String imsi = dan + " * " + i + " = " + (dan * i);
            System.out.print(imsi + "\t");
        }
        System.out.println();
    }

    private static void Ex01() {
        int[] arr = { 11, 35, 47, 84 };
        double res = deviation(arr);
        System.out.println("RESULT : " + res);
    }

    private static double deviation(int[] arr) {
        double avg = 0.0;
        double tmp = 0.0;

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg /= arr.length;
        for (int i = 0; i < arr.length; i++) {
            tmp += (arr[i] - avg) * (arr[i] - avg);
        }
        return Math.sqrt(tmp / arr.length);
    }
}