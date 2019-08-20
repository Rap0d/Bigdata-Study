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
        
        For02(20);
    }

    private static void For02(int max) {
        int odd = 0, even = 0;

        for (int i = 1; i <= max; i++) {
            if(i%2 == 0)
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
            if(i%st == 0)
            System.out.println();
        }
    }

    private static void Star(int row1, int col1) {
        for(int i = 1; i <= col1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void Pow(int num) {
        for (int i = 1; i < num+1; i++) {
            System.out.println(i + "의 제곱은 " + (i * i));
        }
    }

    private static void OneToTen(int su, int j) {
        int total = 0;

        for (int i = j; i < su+1; i++) {
            total += i;
        }
        System.out.println("total : " + total);
    }

    private static void Ex01(int st, int max, int ad) {
        int total = 0;
        for (int i = st; i < max; i+=ad) {
            total += i;
        }
        System.out.println("Res : " + total);
    }

    private static void Ex02(int st, int min, int ad) {
        int total = 0;
        for (int i = st; i > min; i+=ad) {
            total += i;
        }
        System.out.println("Res : " + total);
    }

    private static void Ex03(int st, int max, int ad) {
        int total = 0;
        for (int i = st; i < max; i+=ad) {
            total += i * i;
        }
        System.out.println("Res : " + total);
    }
}