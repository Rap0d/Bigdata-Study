package Jv_190830_11;

import java.util.Vector;

/**
 * PointVectorEx
 */
class Point3 {
    private int x, y;
    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point3> v = new Vector<Point3>();
        // Point 객체를 요소로만 가지는 벡터 생성
        
        // 3개의 Point3 객체 삽입
        v.add(new Point3(2, 3));
        v.add(new Point3(-5, 20));
        v.add(new Point3(30, -8));

        System.out.println("Point");
        for (int i = 0; i < v.size(); i++) {
            Point3 p = v.get(i);
            // 벡터에서 i번째 Point 객체 얻어내기
            System.out.println(p);
            // p.toString()을 이용하여 객체 p 출력
        }
    }
}