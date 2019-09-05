package Jv_190905_15;

/**
 * A07_String00
 */
public class A07_String00 {
    public static void main(String[] args) {
        String str = new String("Hello Java!");

        // length : 글자의 길이, 한글은 1글자
        System.out.println("문자의 갯수 : " + str.length());

        // "Hello J"
        // 방법 : substring과 length("ava!") 이용하기

        // String xxx = str.substring(0, 7) <--- (11 - 4)
        // substring : 문자열 추출 메소드

        // substring : 지정 문자열로부터 문자열 추출(Substraction In String)
        // startIndex 부터 endIndex 직전까지 ...
        System.out.println("str.substring(6, 10) : " + str.substring(6, 10));

        // 매개 변수가 1개이면 문자열 끝까지...
        String str4 = str.substring(4); // 중요!!!
        System.out.println("str.substring(4) : " + str4);

        String xxx = str.substring(0, str.length() - "ava!".length());

        System.out.println("xxx : " + xxx);

        // character At Position
        char ch = str.charAt(6); // 특정 문자 1개

        System.out.println("str.chatAt(6) : " + ch);

        String sTemp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            sTemp += str.charAt(i);
        }
        System.out.println("문자열 뒤집기 : " + sTemp);

        boolean d = str.startsWith("He!");

        System.out.println("str.startsWith('He!') : " + d);

        // endsWith : 으로 끝나는가? ↔ startsWith
        boolean b = str.endsWith("va!"); // 확장자 검사용으로 많이 사용
        // boolean b = str.endsWith(".xls") ; //파일 이름이 엑셀 파일인가 ?

        System.out.println("str.endsWith('va!') : " + b);

        // equals : 문자열이 같은 값을 가지고 있는가?
        System.out.println("같은 문자: " + str.equals("hello java!"));

        // 대소문자 무시하고 같은가 ?
        boolean c = str.equalsIgnoreCase("hello java!");

        System.out.println("str.equalsIgnoreCase('hello java!') : " + c);

        System.out.println("첫번째 a의 위치 : " + str.indexOf("a"));

        // lastIndexOf : 뒤에서부터 글자의 위치
        System.out.println("마지막 a의 위치 : " + str.lastIndexOf("a"));

        // 양쪽 t 사이의 문자를 역순으로 출력(t는 제외)
        String abc = "last god father";

        int startidx = abc.indexOf("t");
        int endidx = abc.lastIndexOf("t");
        sTemp = "";
        for (int i = endidx - 1; i > startidx; i--) {
            sTemp += abc.charAt(i);
        }
        System.out.println("문자열 찾기 : " + sTemp);

        // toCharArray() : char 배열로 만들기

        System.out.println("대문자 변환 : " + str.toUpperCase());// toLowerCase

        String sTrim = "     ddd ee ff           ";

        // whiteCharacter : 아스키 코드 1~32, 127번
        // trim : 양쪽 공백 잘라내기
        System.out.println("sTrim : " + sTrim.trim());

        String str1 = new String("abcdefg");

        System.out.println("문자열 치환 = " + str1.replace('a', 'A') + "\t[str1.replace('a', 'A')]");

        System.out.println();

        double d99 = 10.3;

        char ch99[] = { '오', '늘', '날', '씨', ' ', '온', '도', '는' };

        // String.value(숫자) ==> 문자열
        String str99 = String.valueOf(ch99) + " " + String.valueOf(d99);
        System.out.println(str99);

        // -------------------------------------------------------
        // new 연산자를 사용하지 않는 경우에는 이미 만들어진 문자열 상수를 공유
        String s1 = "aaa";

        String s2 = "aaa";

        // new 연산자를 사용하면 별도의 기억 공간이 할당된다.
        String s3 = new String("aaa");

        System.out.println("s1 == s2  : " + (s1 == s2));

        // equals 메소드는 객체의 내용을 비교하는 메소드이다.
        System.out.println("s1 equals s2  : " + s1.equals(s2));

        // 일반 변수 선언 방식과 new 연산자를 이용한 선언 방식의 비교
        System.out.println("s1 == s3  : " + (s1 == s3));

        System.out.println("s1 equals s3  : " + s1.equals(s3)); // 중요!!!!
    }
}