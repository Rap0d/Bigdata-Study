package Jv_190816_01;

public class PrintMe {
    public static void main(String[] args) {
        System.gc();    // Memory init
        long preUseMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        String name;
        int age;
        double height;
        float weight;
        boolean bool;
        char blood;

        name = "홍길동";
        age = 30;
        height = 178.5;
        bool = false;
        blood = 'A';
        weight = 60.4f;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("진위 : " + bool);

        System.out.println("\n------------------------\n");

        float f = 0.25f;
        double d = age + f;
        char c = 'a';
        String name2 = "NAME2";

        System.out.println("float형 변수 f : " + f);
        System.out.println("age와 f를 더한 값으로 초기화된 double형 d : " + d);
        System.out.println("char형 c : " + c);
        System.out.println("String형으로 초기화된 name2 : " + name2);

        System.gc();
        long aftUseMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long useMemory = (preUseMemory - aftUseMemory) / 1000;

        System.out.println("useMemory : " + useMemory);
    }
}