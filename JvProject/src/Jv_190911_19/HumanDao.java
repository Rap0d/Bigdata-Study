package Jv_190911_19;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HumanDao {
    public HumanDao() {
    }

    public Hashtable<String, String> list2Table(List<Human> list) {
        Hashtable<String, String> ht = new Hashtable<String, String>();
        for(Human h : list)
            ht.put(h.getName(), h.getPw());
        return ht;
    }

    public void printTable(Hashtable<String, String> ht) {
        Set<String> keys = ht.keySet();
        for(String key : keys)
            System.out.println(key + " " + ht.get(key));
    }
}
