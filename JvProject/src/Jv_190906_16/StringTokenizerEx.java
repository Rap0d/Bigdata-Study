package Jv_190906_16;

import java.util.StringTokenizer;

/**
 * StringTokenizerEx
 */
public class StringTokenizerEx {

    public static void main(String[] args) {
        toEx();
    }

    private static void toEx() {
        // 토큰 구분자(delimiter)가 없으면 기본 값은 공백이 된다.
        StringTokenizer st = new StringTokenizer("소녀시대 원더걸스 빅뱅");

        // countTokens() : 토큰이 몇개인가요?
        System.out.println("토큰 갯수 " + st.countTokens());

        while (st.hasMoreTokens()) {// 있으면 true
            System.out.println(st.nextToken());// 1개씩 끄집어내기
        }

        System.out.println("----------------------------------------");

        StringTokenizer st2 = new StringTokenizer("소녀시대,원더걸스,빅뱅,2NE1", ",");

        System.out.println("토큰 갯수 " + st2.countTokens());

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        System.out.println("----------------------------------------");

        // 세번째 매개 변수 : delimiter도 리턴하기(true인 경우)
        StringTokenizer st3 = new StringTokenizer("id=abc&pw=1234&addr=xxx", "=&", true);

        System.out.println("토큰 갯수 " + st3.countTokens());

        while (st3.hasMoreTokens()) {
            String token = st3.nextToken();
            if (token.equals("=")) {
                System.out.print("\t");
            } else if (token.equals("&")) {
                System.out.print("\n");
            } else {
                System.out.print(token);
            }
        }
    }
}