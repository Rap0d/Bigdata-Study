package Jv_190910_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * CusGene
 */
public class CusGene {

    public static void main(String[] args) {
        TypeGene tg[] = new TypeGene[2];

        tg[0] = new TypeGene(3);
        tg[1] = new TypeGene(6);

        List<TypeGene> al = new ArrayList<TypeGene>();
        for(int i = 0; i < tg.length; i++)
            al.add(tg[i]);
        printList(al);
        Collections.shuffle(al);
        itList(al);
        // Collections.sort(al, Collections.reverseOrder());
        itList(al);
    }

    private static void printList(List<TypeGene> tg) {
        System.out.println();
        System.out.println("Data");
        for (TypeGene tt : tg) {
            System.out.println(tt);
        }
    }

    private static void itList(List<TypeGene> tg) {
        System.out.println();
        Iterator<TypeGene> it = tg.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class TypeGene {
    private int num;
    private int res;

    public TypeGene(int num) {
        this.num = num;
        mulNum(num);
    }

    @Override
    public String toString() {
        return "num : " + num + ", res : " + res;
    }

    private void mulNum(int n) {
        res = num * 2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRes() {
        return res;
    }
}