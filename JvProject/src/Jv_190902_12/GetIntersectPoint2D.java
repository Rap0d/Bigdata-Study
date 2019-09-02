package Jv_190902_12;

/**
 * GetIntersectPoint2D
 */
public class GetIntersectPoint2D {
    public static void main(String[] args) {
        GetIntersectPoint gip = new GetIntersectPoint();
        CPoint po1 = new CPoint(0, 0);   CPoint po2 = new CPoint(20, 10);
        CPoint po3 = new CPoint(0, 10);  CPoint po4 = new CPoint(12, 0);

        gip.getIntersect(po1, po2, po3, po4).display();    // 교점 좌표 도출
        CPoint po5 = new CPoint(gip.getIntersect(po1, po2, po3, po4));
        CPoint po6 = new CPoint(20, 0);  // x축 위의 좌표

        Triangle t1 = new Triangle(po2, po4, po5);
        Triangle t2 = new Triangle(po4, po6, po2);

        System.out.println("Area : " + (t1.getArea() + t2.getArea()));
    }
}

class GetIntersectPoint {
    CPoint getIntersect(CPoint x1, CPoint x2, CPoint x3, CPoint x4) {
        float fIncrease1 = 0, fConstant1 = 0, fSameValue1 = 0;
        float fIncrease2 = 0, fConstant2 = 0, fSameValue2 = 0;

        if (x1.x == x2.x) {
            fSameValue1 = x1.x;
        } else {
            fIncrease1 = (float) (x2.y - x1.y) / (x2.x - x1.x); // 기울기
            fConstant1 = x1.y - fIncrease1 * x1.x; // 상수값
        }

        if (x3.x == x4.x) {
            fSameValue2 = x3.x;
        } else {
            fIncrease2 = (float) (x4.y - x3.y) / (x4.x - x3.x); // 기울기
            fConstant2 = x3.y - fIncrease2 * x3.x; // 상수값
        }

        CPoint pResult = new CPoint();
        if (x1.x == x2.x && x3.x == x4.x)
            System.out.println("평행하여 교점 없음");
        if (x1.x == x2.x) {
            pResult = new CPoint(fSameValue1, fIncrease2 * fSameValue1 + fConstant2);
        } else if (x3.x == x4.x) {
            pResult = new CPoint(fSameValue2, fIncrease1 * fSameValue2 + fConstant1);
        } else {
            pResult.x = -(fConstant1 - fConstant2) / (fIncrease1 - fIncrease2);
            pResult.y = fIncrease1 * pResult.x + fConstant1;
        }
        return pResult;
    }
}