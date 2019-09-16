package Jv_190916_20;

import java.util.*;

/**
 * MyStack
 */
class MyStack {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();

        lists.add("bigbang");
        lists.add("wonder");
        lists.add("kara");
        lists.add("soshi");

        Stack<String> stack = new Stack<String>();

        // lists로 부터 1개씩 끄집어 내서 스택에 넣기
        for (String item : lists) {
            stack.push(item);
        }

        // 스택에 kara 요소가 들어 있나요
        int idx = stack.search("kara"); // 가장 최근에 넣은 것이 1번이다.
        System.out.println(idx);

        boolean bool = stack.empty(); // 스택이 비어 있나요?
        System.out.println("empty() : " + bool);

        // 인덱스 1번에 티아라를 추가하세요
        stack.insertElementAt("t-ara", 1);

        // 3번째 요소를 제거하세요
        stack.removeElementAt(3);

        // 완전히 비울 때 까지 pop한다
        while (!stack.isEmpty()) {// 비어 있지 않으면
            System.out.println(stack.pop());// 끄집어 내기
        }
        // 스택 역시 확장 for 문을 이용하여 추출 가능하다

        try { // 오류/예외가 생길 가능성이 있는 코드는 여기에 작성
            System.out.println(stack.pop());

        } catch (EmptyStackException e) { // 예외에 대한 어떠한 적절한 조치
            System.out.println("스택 pop 오류.");
            System.out.println(e);
        }
    }
}