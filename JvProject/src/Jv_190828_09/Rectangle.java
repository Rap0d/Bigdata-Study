package Jv_190828_09;

/**
 * Rectangle
 */
public class Rectangle {
    private int height;
    private int width;
    private int area;
    private int peri;

    void area() {
        this.area = width * height;
    }

    void perimiter() {
        this.peri = 2 * (width + height);
    }

    String result() {
        String res = "";
        if(area > 300) {
            res = "대형";
        } else if (area > 200) {
            res = "중형";
        } else if (area > 0) {
            res = "소형";
        } else {
            res = "제대로된 값이 아닙니다.";
        }
        return res;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.area();
        this.perimiter();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPeri() {
        return peri;
    }

    public void setPeri(int peri) {
        this.peri = peri;
    }
}