package Jv_190830_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayListEx
 */
public class ArrayListEx {

    public static void main(String[] args) {
        // 문자열만 삽입가능한 ArrayList 컬렉션 생성
        ArrayList<String> a = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = sc.next();
            a.add(s);   // ArrayList 컬렉션에 삽입
        }

        // ArrayList에 들어 있는 모든 이름 출력
        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i); // ArrayList의 i 번째 문자열 얻어오기
            System.out.print(name + " ");
        }

        // 가장 긴 이름 출력
        int longestIndex = 0;   // 현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
        for (int i = 0; i < a.size(); i++) {
            if(a.get(longestIndex).length() < a.get(i).length())    // 이름 길이 비교
                longestIndex = i;   // i 번째 이름이 더 긴 이름
        }
        System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
    }
}