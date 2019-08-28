package Jv_190828_09;

/**
 * CircleMain01
 */
public class CircleMain01 {

    public static void main(String[] args) {
        Circle c1 = new Circle(3, 4, 5.4);
        c1.setRad(10);
        c1.makeCircle();
        System.out.println("Xpos : " + c1.getXpos());
        c1.display();
    }
}

/**
 * Circle
 */
class Circle {
    private double rad = 0.0;
    private double xpos = 0.0;
    private double ypos = 0.0;
    private double res = 0.0;

    Circle(double xpos, double ypos, double rad) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.rad = rad;
    }

    void makeCircle() {
        res = Math.pow(rad, 2.0) * (Math.PI);
    }

    void display() {
        System.out.println("원중심 : (" + xpos + ", " + ypos + ")\n지름 : " + rad + "\n면적 : " + res);
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getXpos() {
        return xpos;
    }

    public void setXpos(double xpos) {
        this.xpos = xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public void setYpos(double ypos) {
        this.ypos = ypos;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}