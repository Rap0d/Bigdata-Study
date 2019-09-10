package Jv_190910_18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * HashSetEx
 */
public class HashSetEx {

    public static void main(String[] args) {
        fiveDimRanNum();
    }

    private static void fiveDimRanNum() {
        Object[] dim = new Object[5];

        for (int i = 0; i < dim.length; i++) {
            HashSet<Integer> hs = new HashSet<Integer>();
            while (true) {
                hs.add(new Random().nextInt(45) + 1);
                if (hs.size() == 6) break;
            }
            dim[i] = hs;
        }

        int cnt = 1;
        for (int i = 0; i < dim.length; i++) {
            HashSet<Integer> hs = (HashSet) dim[i];
            Iterator<Integer> it = (Iterator<Integer>) hs.iterator();
            while (it.hasNext()) {
                int n = it.next();
                System.out.print(n + "\t");
                if (cnt % 6 == 0) System.out.println();
                cnt++;
            }
        }
    }
}