package Jv_190916_20;

import java.util.*;

public class Generator extends Thread {
    Random ran = new Random();
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            int x = ran.nextInt(10) + 1;
            if (map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else
                map.put(x, 1);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        PrintRes();
    }

    private void PrintRes() {
        int cnt = 0;
        System.out.println("Result");
        System.out.println("숫자\t개수");
        for (int i = 1; i <= map.size(); i++) {
            System.out.print(i + "\t" + map.get(i) + "\n");
            try {
                cnt += map.get(i);
            } catch (Exception e) {
                cnt += 0;
            }
        }
        System.out.println("Total : " + cnt + ", Thanks");
    }
}
