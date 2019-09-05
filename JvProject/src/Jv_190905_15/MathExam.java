package Jv_190905_15;

/**
 * MathExam
 */
public class MathExam {

    public static void main(String[] args) {
        System.out.println("다른 한 변의 길이 : " + takeT(4.6, 2.9));
    }

    private static double takeT(double x, double y) {
        double res;
        res = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return res;
    }
}