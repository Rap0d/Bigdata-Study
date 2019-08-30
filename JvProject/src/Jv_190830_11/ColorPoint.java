package Jv_190830_11;

/**
 * ColorPoint
 */
public class ColorPoint extends Point {
    
    private String color;

	public void setColor(String color) {
        this.color = color;
	}

	public void showColorPoint() {
        System.out.print("색상 : " + this.color + " / ");
        super.showPoint();
	}
}