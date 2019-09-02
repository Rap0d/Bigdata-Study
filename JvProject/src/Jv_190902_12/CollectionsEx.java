package Jv_190902_12;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * CollectionsEx
 */
public class CollectionsEx {
    static void printList(LinkedList<String> l) {
        // 리스트의 요소를 모두 출력하는 메소드
        Iterator<String> iterator = l.iterator();
        // Iterator 객체 리턴
        while (iterator.hasNext()) {
            // Iterator 객체에 요소가 있을 때까지 반복
            String e = iterator.next(); // 다음 요소 리턴
            String seperator;
            if (iterator.hasNext())
                seperator = "->";       // 마지막 요소가 아니면 -> 출력
            else
                seperator = "\n";       // 마지막 요소이면 줄바꿈
            System.out.print(e + seperator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");
        
        // static 메소드이므로 클래스 이름으로 바로 호출
        Collections.sort(myList);       // 요소 정렬
        printList(myList);              // 요소 출력

        Collections.reverse(myList);    // 요소 순서 반대로 구성
        printList(myList);

        // 아바타의 인덱스 검색
        int index = Collections.binarySearch(myList, "아바타") + 1;
        System.out.println("아바타는 " + index + "번째 요소입니다.");
    }
}