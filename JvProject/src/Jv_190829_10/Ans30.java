package Jv_190829_10;

/**
 * Ans30
 */
public class Ans30 {

    public static void main(String[] args) {
        Ans30 obj = new Ans30();

        obj.area(10);
        obj.area(5, 10);
        obj.area(5, 15, 10);
    }

    private void area(int top, int bottom, int height) {
        int area = 0;
        System.out.println("TOP: " + top + ", BOTTOM: " + bottom + ", HEIGHT: " + height);
        area = ((top + bottom) * height) / 2;
        System.out.println("사다리꼴의 넓이 : " + area);
    }

    private void area(int width, int height) {
        int area = 0;
        System.out.println("Height : " + height + ", Width : " + width);
        area = width * height;
        System.out.println("사각형의 넓이 : " + area);
    }

    private void area(int radius) {
        double area = 0;
        System.out.println("Radius : " + radius);
        area = (double)(radius * radius) * Math.PI;
        System.out.println("원의 넓이 : " + area);
    }
}