package Jv_190906_16;

public class Rect {
    private int x, y;
    public Rect() {

    }

    public Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Rect rect = (Rect) obj;
        boolean res = 
        ((this.x == rect.x) && (this.y == rect.y)) 
        || ((this.x == rect.y) && (this.y == rect.x));
        return res;
    }
}
