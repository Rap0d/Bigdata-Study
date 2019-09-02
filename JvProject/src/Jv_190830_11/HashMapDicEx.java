package Jv_190830_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * HashMapDicEx
 */
public class HashMapDicEx {
    public static void main(String[] args) {
        // 영어 단어와 한글 단어 쌍을 저장하는 HashMap 컬렉션 생성
        HashMap<String, String> dic = new HashMap<String, String>();

        // 3개의 (key, value) 쌍을 dic에 저장
        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        // dic 컬렉션에 들어 있는 모든 (key, value) 쌍 출력
        Set<String> keys = dic.keySet();        // key 문자열을 가진 집합 Set 컬렉션 리턴
        Iterator<String> it = keys.iterator();  // key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
        while (it.hasNext()) {
            String key = it.next();
            String value = dic.get(key);
            System.out.println("(" + key + ", " + value + ")");
        }

        // 사용자로부터 영어 단어를 입력받고 한글 단어 검색
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("찾고 싶은 단어는? ");
            String eng = sc.next();
            System.out.println(dic.get(eng));
            // '키' eng에 해당하는 '값' 리턴
        }
    }
}