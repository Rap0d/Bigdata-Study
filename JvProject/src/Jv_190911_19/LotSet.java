package Jv_190911_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * LotSet
 */
public class LotSet {

    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<Integer>();
        int secondno = 0;
        Random random = new Random();
        while (lotto.size() < 7) {
            
            int su = random.nextInt(45) + 1;
            if(lotto.size() == 6)
                secondno = su;
            lotto.add(su);
        }
        lotto.remove(secondno);
        Object[] obj = lotto.toArray();
        Arrays.sort(obj);

        System.out.println(lotto);

        for(Object bunho : obj)
            System.out.print(bunho + "\t");

        System.out.println();
        System.out.println(secondno);
    }
}