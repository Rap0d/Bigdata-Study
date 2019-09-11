package Jv_190911_19;

import java.util.*;

/**
 * PropertyEx
 */
public class PropertyEx {
    public static void main(String[] args) {
        Properties prop = new Properties();
        // 변수를 관리하기 위한 클래스

        prop.put("id", "hong");
        prop.put("name", "홍길동");
        prop.put("password", "1234");
        prop.put("address", "마포구 공덕동");
        prop.put("zipcode", "123-456");

        System.out.println("프로퍼티 수 : " + prop.size());

        String id = prop.getProperty("id");
        System.out.println("아이디 :" + id);

        // hphone 항목이 존재하지 않으면 추가하세요.
        if (prop.getProperty("hphone") == null) {
            prop.put("hphone", "010-3333-4444");
        }

        String hphone = prop.getProperty("hphone");
        System.out.println("휴대폰 :" + hphone);

        Enumeration enu = prop.keys();

        System.out.println("프로퍼티들 리스트");
        while (enu.hasMoreElements()) {
            Object property = enu.nextElement();
            String value = prop.getProperty((String) property);
            System.out.println(property + "/" + value);
        }

        System.out.println("toString() 메소드 : " + prop.toString());

        // 목록을 콘솔 창에 출력
        prop.list(System.out);
    }
}