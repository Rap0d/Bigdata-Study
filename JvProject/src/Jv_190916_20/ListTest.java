package Jv_190916_20;

import java.util.*;

/**
 * ListTest
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();

        lists.add("가");
        lists.add("나");
        lists.add("다");
        lists.add("라");
        lists.add("마");
        lists.add("바");
        lists.add("사");
        lists.add("아");

        List<String> total = new ArrayList<String>();

        total = lists.subList(1, lists.size()-1);

        // sublist(), addAll() 메소드를 이용하여, 구현하세요.

        System.out.println(total.toString()); // [나, 다, 라, 바, 사]
    }
}