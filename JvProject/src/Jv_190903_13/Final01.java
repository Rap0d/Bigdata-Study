package Jv_190903_13;

/**
 * Final01
 */
public class Final01 {

    public static void main(String[] args) {
        // Mclass.message = ""; 
        Cclass obj1 = new Cclass();
    }
}

class Mclass {
    static final String message = "Hello.";
    void display() {

    }
}

class Cclass extends Mclass {

}