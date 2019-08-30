package Jv_190830_11;

/**
 * PointMain
 */
public class PointMain {

    public static void main(String[] args) {

        System.out.println("실행 결과");

        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();

        String myColor[] = new String[]{"RED", "YELLO", "BLUE", "GREEN"};
        ColorPoint[] cpp = new ColorPoint[4];

        for (int i = 0; i < cpp.length; i++) {
            cpp[i] = new ColorPoint();
            cpp[i].set(i, i * 2);
            cpp[i].setColor(myColor[i]);
            cpp[i].showColorPoint();
        }
    }
}