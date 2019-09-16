package Jv_190911_19;

import java.util.*;

/**
 * DosirakMain
 */
public class DosirakMain {

    public static void main(String[] args) {
        Saram soo = new Saram("Kim CS", "Mapo Gongduk");

        String[] banchan1 = new String[] { "amook", "kimchi", "pumkin salad" };
        Dosirak dosirak1 = new Dosirak(soo, "Mehwa Dosirak", 100000, banchan1);

        List<Dosirak> lists = new ArrayList<Dosirak>();

        lists.add(dosirak1);

        lists.add(new Dosirak(new Saram("Park YH", "Yongsan Dowon"), "Jindalrae", 7000,
                new String[] { "Egg", "Seaweed", "Anchovy" }));
        delivery(lists);
    }

    private static void delivery(List<Dosirak> lists) {
        System.out.println("도시락 주문 내역");
        System.out.println("고객명\t\t배송지\t\t도시락이름\t단가\t\t반찬1\t\t반찬2\t\t반찬3");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------");
        for (Dosirak li : lists) {
            System.out.print(li.getSaram().getName() + "\t\t" + li.getSaram().getAddr() + "\t" + li.getDname() + "\t"
                    + li.getPrice() + "\t");
            for (String bc : li.getBanchan()) {
                System.out.print(bc + "\t\t");
            }
            System.out.println();
        }
    }
}