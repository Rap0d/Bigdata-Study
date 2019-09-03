package Jv_190903_13;

/**
 * MyStack
 */
public class MyStack {

    public static void main(String[] args) {
        GStack<String> stringStack = new GStack<String>();
        // String 타입의 GStack 생성
        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");

        for (int n = 0; n < 3; n++) {
            System.out.println(stringStack.pop());
            // stringStack 스택에 있는 3개의 문자열 pop
        }

        GStack<Integer> intStack = new GStack<Integer>();
        // Integer 타입의 GStack 생성
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for (int n = 0; n < 3; n++) {
            System.out.println(intStack.pop());
            // intStack 스택에 있는 3개의 정수 pop
        }
    }
}