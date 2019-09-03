package Jv_190903_13;

/**
 * Final01
 */
public class Final01 {

    public static void main(String[] args) {
        // Mclass.message = ""; 
        Cclass obj1 = new Cclass();
        obj1.display();
        obj1.some();
    }
}

class Mclass {
    static final String message = "Hello.";
    void display() {
        System.out.println("HHi");
    }
    public final void some() {
        System.out.println("final");
    }
}

class Cclass extends Mclass {
    @Override
    void display() {
        System.out.println("hi");
    }
    // @Override
    // void some() {
    //     System.out.println("no");
    // }
}