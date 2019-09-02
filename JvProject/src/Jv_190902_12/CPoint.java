package Jv_190902_12;

class CPoint {
    float x;
    float y;

    CPoint() {
    }

    CPoint(int x, int y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    CPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public CPoint(CPoint intersectPoint) {
        this.x = intersectPoint.x;
        this.y = intersectPoint.y;
	}

	void display() {
        System.out.println("교점 : " + x + ", " + y);
    }
}