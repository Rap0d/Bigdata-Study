package Jv_190830_11;

class MySuper {
    int x = 100;
    String hello = "Hello";
    public void sayHello() {
        System.out.println("message : " + this.hello);
    }
}

class MySub extends MySuper {
    int y = 200;
}

/**
 * InheTest
 */
public class InheTest {

    public static void main(String[] args) {
        MySub sub = new MySub();
        System.out.println("sub.y : " + sub.y);
        sub.y = 500;
        System.out.println("sub.y : " + sub.y);
        System.out.println("sub.x : " + sub.x);
        System.out.println(sub.hello);
        sub.sayHello();
    }
}