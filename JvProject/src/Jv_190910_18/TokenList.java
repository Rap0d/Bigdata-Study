package Jv_190910_18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * TokenList
 */
public class TokenList {

    public static void main(String[] args) {
        String str = "소녀시대 원더걸스 빅뱅";
        List<String> ls = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            ls.add(st.nextToken());
        }

        display(ls);
    }

    private static void display(List<String> ls) {
        Iterator<String> it = ls.iterator();
        System.out.println("Iterator를 이용한 출력");
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}