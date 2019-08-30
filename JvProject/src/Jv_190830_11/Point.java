package Jv_190830_11;

/**
 * Point
 */
public class Point {
    private double xpos;
    private double ypos;    

    Point() {
        
    }

    public void set(double xpos, double ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void showPoint() {
        System.out.println("좌표 : " + xpos + ", " + ypos);
    }
}