package Jv_190830_11;

import java.util.Vector;

/**
 * VectorEx
 */
public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);

        // 벡터 중간에 삽입하기
        v.add(2, 100);  // 4, -1 사이에 정수 100 삽입

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터 내의 현재 용량 : " + v.capacity());
        
        System.out.println("벡터 요소 출력");
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n + " ");
        }

        System.out.print("벡터 모든 요소의 합 : ");
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.elementAt(i);
        }
        System.out.println(sum + " ");
    }
}