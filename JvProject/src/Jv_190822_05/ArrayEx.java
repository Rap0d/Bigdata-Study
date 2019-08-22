package Jv_190822_05;

/**
 * ArrayEx
 */
public class ArrayEx {

    public static void main(String[] args) {
        randomEx();
        Ex01();
    }

    private static void Ex01() {
        double[] arr = new double[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomEx();
            System.out.println(arr[i]);
        }

        double max = -99999.0;
        double min = 99999.0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max : " + max + ", min : " + min);
    }

    private static double randomEx() {
        int cng = 1;

        if (((int) (Math.random() * 10) % 2) == 0) {
            cng *= -1;
        }
        return (double) (Math.random() * 100);
        // System.out.println(Math.random() * 100000 * cng);
    }
}