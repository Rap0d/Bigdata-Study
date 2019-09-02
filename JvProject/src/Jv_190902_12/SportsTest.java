package Jv_190902_12;

/**
 * SportsTest
 */
public class SportsTest {

    public static void main(String[] args) {
        Baseball b = new Baseball("야구", 9, 0.345);
        Football f = new Football("축구", 11, 6);
        
        b.play();
        b.Display();
        
        f.show();
        System.out.println(f);
    }
}