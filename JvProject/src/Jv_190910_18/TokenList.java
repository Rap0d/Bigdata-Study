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
        String[] sta = new String[st.countTokens()];

        int i = 0;
        while (st.hasMoreTokens()) {
            sta[i] = st.nextToken();
            ls.add(sta[i]);
            i++;
        }

        display(ls);
        display(sta);
    }

    private static void display(String[] sta) {
        System.out.println("ARRAY");
        for (String i : sta) {
            System.out.println(i);
        }
    }

    private static void display(List<String> ls) {
        Iterator<String> it = ls.iterator();
        System.out.println("Iterator를 이용한 출력");
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("FOREACH");
        for (String i : ls) {
            System.out.println(i);
        }
    }
}