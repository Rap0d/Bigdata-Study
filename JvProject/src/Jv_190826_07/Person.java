package Jv_190826_07;

/**
 * Person
 */
public class Person {
    String country = "";
    String name = "";
    double height = 0.0;
    double weight = 0.0;
    String hob = "";
    String bl = "";

    void display() {
        System.out.println("국적 : " + country);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hob);
        System.out.println("혈액형 : " + bl);
    }
}