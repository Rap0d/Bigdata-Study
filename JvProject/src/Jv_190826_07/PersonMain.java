package Jv_190826_07;

/**
 * PersonMain
 */
public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.country = "한국";
        p1.name = "강감찬";
        p1.height = 175.4;
        p1.weight = 66.3;
        p1.hob = "당구";
        p1.bl = "AB";

        p1.display();

        p2.country = "한국";
        p2.name = "강감찬";
        p2.height = 175.4;
        p2.weight = 66.3;
        p2.hob = "당구";
        p2.bl = "AB";

        p2.display();
    }
}