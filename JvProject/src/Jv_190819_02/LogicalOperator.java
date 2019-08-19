package Jv_190819_02;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println('a' > 'b');  // casting
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);  // casting
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2));
        System.out.println((3 > 2) && (3 > 4));

        int x = 3, y = 2;
        System.out.println((x != y) || (-1 > 0));

        Operator01();
    }

    private static void Operator01() {
        int a = 10;
        int b = 8;

        boolean bool1 = a != b;
        boolean bool2 = --a == b++; // a = 9, b = 8 -> a = 9, b = 9

        boolean bool3 = a++ != --b; // a = 9, b = 8 -> a = 10, b = 8

        boolean bool4 = bool3 && (5 > 7);
        boolean bool5 = !bool4 || (bool1 && bool2);

        System.out.println("bool1 : "  + bool1);
        System.out.println("bool2 : "  + bool2);
        System.out.println("bool3 : "  + bool3);
        System.out.println("bool4 : "  + bool4);
        System.out.println("bool5 : "  + bool5);
    }
}