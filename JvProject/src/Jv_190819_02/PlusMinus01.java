package Jv_190819_02;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = ++a + b++;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        c = a++ + --b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 15;
        b = 12;
        
        c = --a + --b;
        
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
}