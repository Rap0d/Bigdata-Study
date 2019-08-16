package Jv_190816_01;

public class OneToTen {
    public static void main(String[] args) {
        int total, i;
        total = 0;
        i = 1;
        while (true) {
            total += i;
            i++;
            if (i > 10)
                break;
        }
        System.out.println("total = " + total);
    }
}