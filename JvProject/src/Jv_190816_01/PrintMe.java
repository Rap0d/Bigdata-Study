package Jv_190816_01;

public class PrintMe {
    public static void main(String[] args) {
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
    }
}