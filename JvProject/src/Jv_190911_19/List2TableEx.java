package Jv_190911_19;

import java.util.*;

/**
 * List2TableEx
 */
public class List2TableEx {

    public static void main(String[] args) {
        Human kim = new Human("Kim CS", "1111");
        List<Human> lists = new ArrayList<Human>();
        lists.add(kim);
        lists.add(new Human("Choi JS", "2222"));
        lists.add(new Human("Park YH", "3333"));

        HumanDao dao = new HumanDao();
        Hashtable<String, String> ht = dao.list2Table(lists);
        dao.printTable(ht);
    }
}