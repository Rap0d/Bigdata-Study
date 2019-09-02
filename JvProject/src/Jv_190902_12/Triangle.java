package Jv_190902_12;

class Triangle {
	private Point point1;
	private Point point2;
	private Point point3;
	
	public Triangle(int a, int b, int c, int d, int e, int f) {
		this.point1 = new Point(a, b);
		this.point2 = new Point(c, d);
		this.point3 = new Point(e, f);
    }
    
    public Triangle(float a, float b, float c, float d, float e, float f) {
		this.point1 = new Point(a, b);
		this.point2 = new Point(c, d);
		this.point3 = new Point(e, f);
    }
    
    public Triangle(CPoint a1, CPoint a2, CPoint a3) {
        this.point1 = new Point(a1.x, a1.y);
		this.point2 = new Point(a2.x, a2.y);
		this.point3 = new Point(a3.x, a3.y);
    }
	
	public double getLength(Point a, Point b) {
		double xDiff = a.getX() - b.getX();
		double yDiff = a.getY() - b.getY();
		return (Math.sqrt(xDiff * xDiff + yDiff * yDiff));
	}
	
	public double getAngle() {
		double ab = getLength(point1, point2);
		double bc = getLength(point2, point3);
		double ac = getLength(point1, point3);
		double cosA = (bc*bc + ac*ac - ab*ab) / (2 * bc * ac);
		return Math.acos(cosA);
	}
	
	public double getArea() {
		return (getLength(point2, point3) * getLength(point1, point3) * Math.sin(getAngle()) * 0.5);
	}
}
