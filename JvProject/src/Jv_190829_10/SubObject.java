package Jv_190829_10;

class SuperObject {
    String name;
    void paint() {
        draw();
    }
    void draw() {
        int a = 10;
        System.out.println(name + a);
    }
    int aaa() {
        int a = 113;
        return a;
    }
}
public class SubObject extends SuperObject {
    String name;
    void draw() {
        name = "Sub";
        int a = super.aaa();
        super.name = "Super";
        super.draw();
        System.out.println(name + a);
    }
    public static void main(String[] args) {
        SuperObject b = new SubObject();
        b.paint();
    }
}