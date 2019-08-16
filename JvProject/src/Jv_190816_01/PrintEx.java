package Jv_190816_01;

public class PrintEx {
    public static void main(String[] args) {
        int i = 65;
        char ch = 'a';
        double d = 12.3456789;
        int age = 35;
        String name = "홍길동";

        System.out.println(d);
        System.out.printf("실수1 : [%f]\n", d);
        System.out.printf("실수2 : [%10.2f]\n", d);
        System.out.printf("실수3 : [%-10.2f]\n", d);

        System.out.printf("이름은 [%s], 나이는 [%d]\n", name, age);

        System.out.printf("정수를 문자로 : [%c]\n문자를 정수로 : [%d]\n", (char) i, (int) ch);

        while (true) {

            if (i >= 91 && i <= 96) {
                i++;
                continue;
            }

            System.out.println(i + " : " + (char) i);
            i++;

            if ((char) i == 'z') {
                System.out.println(i + " : " + (char) i);
                break;
            }
        }
    }
}