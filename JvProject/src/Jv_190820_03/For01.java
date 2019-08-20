package Jv_190820_03;

/**
 * For01
 */
public class For01 {

    public static void main(String[] args) {
        Ex01(1, 11, 1);
        Ex01(1, 101, 3);
        Ex02(97, 1, -5);
        Ex03(1, 97, 5);

        OneToTen(100, 7);

        Pow(3);

        Star(0, 10);
        Star2(4, 10);

        For02(10);
        For04(10);
        For05(10);

        Differ(50);

        SumTest(10);
        TotalSum(100);

        For06(100);
    }

    private static void For06(int max) {
        double sum = 0.0;

        for (int i = 1; i <= max; i++) {
            sum += i%2==0 ? (-1 / (double)i) : (1 / (double)i);
        }
        System.out.println("sum : " + sum);
    }

    private static void TotalSum(int max) {
        double sum = 0.0;
        for (int i = 1; i <= max; i++) {
            sum += (double)(i-1)/i;
        }
        System.out.println("sum : " + sum);
    }

    private static void SumTest(int max) {
        int sumA = 0; int sumB = 0; int sumC = 0;

        for (int i = 1; i <= max; i++) {
            if(i%3==0)
            sumA += i;
            else if (i >= 5 && i != 8)
            sumB += i;
            else if (i < 5)
            sumC += i;
        }

        System.out.println("sumA : " + sumA + ", sumB : " + sumB + ", sumC : " + sumC);
    }

    private static void Differ(int max) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 1; i <= max; i++) {
            if(i%3==0)
            sumA += i;
            else
            sumB += i;
        }
        System.out.println("sumA : " + sumA + " - sumB : " + sumB + " = " + (sumA - sumB));
    }

    private static void For05(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            if(i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        System.out.println("sum : " + sum);
    }

    private static void For04(int max) {
        int sum0 = 0, sum1 = 0, sum2 = 0;
        for (int i = 1; i <= max; i++) {
            switch (i % 3) {
            case 0:
                sum0 += i;
                break;
            case 1:
                sum1 += i;
                break;
            case 2:
                sum2 += i;
                break;
            }
        }
        System.out.println("sum 0 : " + sum0);
        System.out.println("sum 1 : " + sum1);
        System.out.println("sum 2 : " + sum2);
    }

    private static void For02(int max) {
        int odd = 0, even = 0;

        for (int i = 1; i <= max; i++) {
            if (i % 2 == 0)
                even += i;
            else
                odd += i;
        }

        System.out.println("Odd : " + odd);
        System.out.println("Even : " + even);
    }

    private static void Star2(int st, int max) {
        for (int i = 1; i <= max; i++) {
            System.out.print("*");
            if (i % st == 0)
                System.out.println();
        }
    }

    private static void Star(int row1, int col1) {
        for (int i = 1; i <= col1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void Pow(int num) {
        for (int i = 1; i < num + 1; i++) {
            System.out.println(i + "의 제곱은 " + (i * i));
        }
    }

    private static void OneToTen(int su, int j) {
        int total = 0;

        for (int i = j; i < su + 1; i++) {
            total += i;
        }
        System.out.println("total : " + total);
    }

    private static void Ex01(int st, int max, int ad) {
        int total = 0;
        for (int i = st; i < max; i += ad) {
            total += i;
        }
        System.out.println("Res : " + total);
    }

    private static void Ex02(int st, int min, int ad) {
        int total = 0;
        for (int i = st; i > min; i += ad) {
            total += i;
        }
        System.out.println("Res : " + total);
    }

    private static void Ex03(int st, int max, int ad) {
        int total = 0;
        for (int i = st; i < max; i += ad) {
            total += i * i;
        }
        System.out.println("Res : " + total);
    }
}