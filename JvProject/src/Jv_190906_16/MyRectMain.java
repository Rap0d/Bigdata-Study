package Jv_190906_16;

/**
 * MyRectMain
 */
public class MyRectMain {

    public static void main(String[] args) {
        Rect rectA = new Rect(2, 3);
        Rect rectB = new Rect(3, 2);
        Rect rectC = new Rect(3, 4);
        
        if(rectA.equals(rectB)) {
            System.out.println("사각형 A는 사각형 B와 동일합니다.");
        }
        if(rectA.equals(rectC)) {
            System.out.println("사각형 A는 사각형 C와 동일합니다.");
        }
        if(rectC.equals(rectB)) {
            System.out.println("사각형 C는 사각형 B와 동일합니다.");
        }
    }
}