package Jv_190911_19;

import java.util.*;

/**
 * HashTable
 */
public class HashTableEx {

    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<String, String>();

        String[] myKey = { "ss", "wg", "kr", "as" };
        String[] myVal = { "Girls", "Wonder", "Kara", "After" };

        for (int i = 0; i < myKey.length; i++) {
            ht.put(myKey[i], myVal[i]);
        }

        Enumeration en = ht.keys();

        System.out.println("HashTable");
        while (en.hasMoreElements()) {
            Object obj = en.nextElement();
            String val = ht.get((String) obj);
            System.out.println(obj + " : " + val);
        }

        System.out.println("\nkeySet Print");

        Set<String> keys = ht.keySet();

        for (String key : keys) {
            String val = ht.get(key);
            String tmp = key + " : " + val;
            System.out.println(tmp);
        }
    }
}