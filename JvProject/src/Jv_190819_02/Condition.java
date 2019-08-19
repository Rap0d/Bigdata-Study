package Jv_190819_02;

public class Condition {
    public static void main(String[] args) {
        Condition02();
    }

    private static void Condition02() {
        int x = 3, y = 2;

        int result = x > y ? 5 : 3;
        System.out.println("Result : " + result);

        int a = 2, b = 4;
        x = (a > b) ? 5 : (a + 2);
        System.out.println("x : " + x);

        x = 5;
        result = x%2 == 0 ? x + 3 : x * x;
        System.out.println("Result : " + result);

        x = 8; y = 4;
        result = x > y ? x : y;
        System.out.println("Result : " + result);

        x = 5; y = 12;
        String str = y%x == 0 ? "yes" : "no";
        System.out.println("str : " + str);
    }
}