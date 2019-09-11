package Jv_190911_19;

import java.util.*;

/**
 * HashMapEx
 */
public class HashMapEx {

    public static void main(String[] args) {
        // mapEx01();
        // mapEx02();
        // mapEx03();
        mapEx04();
    }

    private static void mapEx04() {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        List<String> l3 = new ArrayList<String>();
        
        l1.add("Gang");
        l1.add("Park");

        l2.add("Hong");
        l2.add("Lee");
        l2.add("Kim");

        l3.add("Sin");
        l3.add("Lim");

        map.put("Blue", l1);
        map.put("Red", l2);
        map.put("Green", l3);

        Set<String> keys = map.keySet();

        for(String key : keys) {
            List<String> val = map.get(key);
            System.out.println(key);
            Iterator<String> tmp = val.iterator();
            while(tmp.hasNext())
                System.out.print(tmp.next() + " ");
            System.out.println();
        }
    }

    private static void mapEx03() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Blue", "Moon");
        map.put("Red", "Hong");
        map.put("Green", "Ahn");
        map.put("SBlue", "Yoo");
        map.put("Yello", "Sim");

        Set<String> keys = map.keySet();

        for(String key : keys) {
            String val = map.get(key);
            String tmp = val + "\t: " + key;
            System.out.println(tmp);
        }
    }

    private static void mapEx02() {
        Map<String, String> map = new HashMap<String, String>();
        
        map.put("name", "Hong");
        map.put("address", "Seoul, Korea");
        map.put("phone", "010-2313-1111");
        map.put("pw", "1323");
        
        System.out.println("Map Size : " + map.size());

        if(!map.containsKey("id")){
            map.put("id", "1");
        }

        System.out.println("!!!!!name : " + map.get("name"));

        String id = map.get("id");
        System.out.println("ID : " + id);

        String gender = map.get("gender");
        System.out.println(gender);

        if(!map.containsKey("gender"))
            map.put("gender", "M");
        
        Set<String> keys = map.keySet();

        for(String key : keys) {
            String val = map.get(key);
            String tmp = key + "\t/ " + val;
            System.out.println(tmp);
        }
    }

    private static void mapEx01() {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "삼성");
        map.put(2, "롯데");
        map.put(3, "기아");
        map.put(4, "SK");

        boolean bool = map.containsKey(6);
        System.out.println("Elements Size = " + map.size());
        System.out.println(bool);

        Set<Integer> keyList = map.keySet();
        
        for(Integer key : keyList) {
            String val = map.get(key);
            System.out.println("Key : " + key + ", Value : " + val);
        }

        map.clear();
        if(map.size() == 0)
            System.out.println("Empty");
        else {
            for(Integer key : keyList) {
                String val = map.get(key);
                System.out.println("Key : " + key + ", Value : " + val);
            }
        }
    }
}