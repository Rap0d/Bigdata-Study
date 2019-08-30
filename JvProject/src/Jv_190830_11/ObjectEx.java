package Jv_190830_11;

class Saram { // extends Object{
    @Override
    public String toString() {
        return "오버라이드 되었습니다";
    }
}

public class ObjectEx {
    public static void main(String[] args) {
        Saram hong = new Saram();
        int hashcode = hong.hashCode();
        System.out.println("해시 코드 : " + hashcode);

        System.out.println(hong.getClass());
        System.out.println(hong);
        System.out.println(hong.toString());

        // Integer 클래스 : 기본 자료형인 int를 객체 형태로 다루기 위한 클래스
        // toHexString 메소드는 10진수를 16진수로 바꿔 준다.
        System.out.println(Integer.toHexString(hashcode));
    }
}